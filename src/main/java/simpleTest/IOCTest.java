package simpleTest;

import org.junit.Test;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tjc.bean.User;

public class IOCTest {

	
	public static void main(String args[]) throws BeansException{
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		User user = (User)context.getBean("user");
		System.out.println(user.getName());
	}
}
