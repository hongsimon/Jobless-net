package jobless;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import jobless.dao.UserDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/resources/beans.xml")
public class Test {
	@Autowired
	ApplicationContext context;

	@Autowired
	UserDAO dao;

	@org.junit.Test
	public void test1() {
		System.out.println(dao.select());
	}
}
