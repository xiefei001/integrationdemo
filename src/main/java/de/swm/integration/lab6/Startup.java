package de.swm.integration.lab6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Created by xie.fei on 03.03.2016.
 */
public class Startup {

	public static void main(String[] args) throws InterruptedException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("lab6/content.xml");
		while (true) {
		}
	}
}
