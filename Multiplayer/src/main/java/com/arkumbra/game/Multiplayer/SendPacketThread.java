package com.arkumbra.game.Multiplayer;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import error.Message;
import error.Message.MSGType;

public class SendPacketThread implements Runnable {
	private Socket client;
	
	
	public SendPacketThread(String ip) throws UnknownHostException,
														IOException {
		
			client = new Socket(ip, ConnectionManager.PORT_NO);
	}
	
	public void run() {
		
	}

}
