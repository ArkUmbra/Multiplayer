package com.arkumbra.game.Multiplayer;

import java.io.IOException;
import java.net.ServerSocket;

public class ReceivePacketThread implements Runnable {
	
	private ServerSocket 	server;
	private boolean			running;
	
	public ReceivePacketThread() throws IOException {
		server = new ServerSocket(ConnectionManager.PORT_NO);
	}

	public void run() {
		running = true;
		while(running) {
			
		}
	}

}
