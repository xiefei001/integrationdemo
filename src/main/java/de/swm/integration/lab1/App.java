package de.swm.integration.lab1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;



/**
 * Hello world!
 */
public class App {
	public static void main(String[] args) throws InterruptedException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("lab1/context.xml");
		MessageChannel channel = ctx.getBean("messageChannel_2", MessageChannel.class);
		int index = 0;
		while(true) {
			Message<String> message1 = MessageBuilder.withPayload("Hello world -one!" + (index++)).build();
			System.out.println("sending message");
			channel.send(message1);
			Thread.sleep(1000);
		}
	}
}
