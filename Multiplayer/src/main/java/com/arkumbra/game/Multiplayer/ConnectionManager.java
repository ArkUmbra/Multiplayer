package com.arkumbra.game.Multiplayer;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

public class ConnectionManager {
	public static final int PORT_NO = 13370;
	private Thread 	server;
	private Thread	client;
	private List<Object> gameState = new ArrayList<Object>();
	
	public ConnectionManager() throws IOException {
		server = new Thread(new ReceivePacketThread());
	}
	
	public void connectTo(String ip) {
		
		try {
			client = new Thread(new SendPacketThread(ip));
			client.start();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

}
