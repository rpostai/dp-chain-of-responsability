package exemplo;

public class EmailHandlerManager {

	private EmailHandler prevHandler;
	
	public void addHandler(EmailHandler handler) {
		if (prevHandler != null) {
			prevHandler.setNext(handler);
		} else {
			prevHandler = handler;
		}
	}
	
	public void send(Email email) {
		if (prevHandler != null) {
			prevHandler.handleRequest(email);
		}
	}
}
