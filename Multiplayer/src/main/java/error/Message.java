package error;

public abstract class Message {
	
	public enum MSGType {
		SUCCESS,
		CONNECT_ERROR
	}
	
	private MSGType e;
	
	public Message(MSGType et) {
		this.e = et;
	}
	
	public MSGType getMessage() {
		return e;
	}

}
