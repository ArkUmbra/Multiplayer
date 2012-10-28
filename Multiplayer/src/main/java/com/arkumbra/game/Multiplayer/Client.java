package com.arkumbra.game.Multiplayer;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;


public class Client {
	ObjectOutputStream out;
	
	public Client() {
		try {
			Socket serverConn = new Socket("192.168.1.87", 13370);
			out = new ObjectOutputStream(serverConn.getOutputStream());
			out.writeObject(new String("H"));
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
