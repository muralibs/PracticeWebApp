package org.practice.websocket;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.server.ServerEndpoint;

/**
 * 
 * @author bsmurali
 *
 */
@ServerEndpoint("/echo")
public class EchoSocketServer {
	
	public EchoSocketServer() {
		System.out.println("In echoSocket server constructor");
	}

	@OnOpen
	public void onOpen() {
		System.out.println("The connection is open");
	}
	
	@OnClose
	public void onClose() {
		System.out.println("The connection is terminated.");
	}
	
	@OnMessage
	public String onMessage(String inputString) {
		System.out.println("New message is received: " + inputString);
		
		return "Echo from Server: " + inputString;
	}
	
	@OnError
	public void onError(Throwable e) {
		e.printStackTrace();
	}
}
