package error;

public class BadConnectMessage extends Message {
	public BadConnectMessage() {
		super(MSGType.CONNECT_ERROR);
	}

}
