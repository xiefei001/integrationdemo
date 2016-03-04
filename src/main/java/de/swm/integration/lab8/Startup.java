package de.swm.integration.lab8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;


/**
 * Created by xie.fei on 03.03.2016.
 */
public class Startup {

    public static void main(String[] args) throws InterruptedException, TimeoutException, ExecutionException {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("lab8/content.xml");

        // Send over Channel
        /*
         * MessageChannel channel = ctx.getBean("requestChannel", MessageChannel.class);
         * Message<String> message = MessageBuilder.withPayload("Hello brave new world!").build();
         * channel.send(message);
        */

        // send synchronous over Gateway
        /*
         * PigLatinService service = ctx.getBean("latinService", PigLatinService.class);
         * System.out.println(service.translate("Hello brave new world"));
         */
        
        // send aynchronous over Gateway
        PigLatinService service = ctx.getBean("latinService", PigLatinService.class);
        Future<String> future = service.translate("Hello brave new world");
        String result = future.get(5000, TimeUnit.SECONDS);
        System.out.println("result: " + result);
        ctx.close();

    }
}
