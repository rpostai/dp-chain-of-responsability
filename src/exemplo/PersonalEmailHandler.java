package exemplo;

public class PersonalEmailHandler extends EmailHandler {

	@Override
	public void handleRequest(Email email) {
		System.out.println("Tratando email Personal Email Handler");
		if (email.getRemetente().contains("gmail.com")) {
			// nao interessa
		}
		super.handleRequest(email);
	}

}
