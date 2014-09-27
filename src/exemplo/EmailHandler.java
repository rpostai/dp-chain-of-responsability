package exemplo;
public abstract class EmailHandler {

	private EmailHandler nextHandler;

	public void setNext(EmailHandler handler) {
		nextHandler = handler;
	}

	public void handleRequest(Email email) {
		if (nextHandler != null) {
			nextHandler.handleRequest(email);
		}
	}

	public EmailHandler getNextHandler() {
		return nextHandler;
	}

}
