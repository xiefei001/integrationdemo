package de.swm.integration.lab3;

import org.springframework.integration.core.MessageSelector;
import org.springframework.messaging.Message;

import java.io.File;



/**
 * Created by xie.fei on 04.03.2016.
 */
public class FileSelector implements MessageSelector{
	public boolean accept(Message<?> message) {
		Object payload = message.getPayload();
		return !(payload instanceof File && ((File)payload).getName().startsWith("msg"));
	}
}
