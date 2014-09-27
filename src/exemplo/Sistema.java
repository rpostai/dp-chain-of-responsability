package exemplo;

public class Sistema {
	
	public static void main(String[] args) {
		Email e = new Email();
		e.setRemetente("xpto@minhaempresa.com");
		e.setDestinatario("x@teste.com");
		e.setMensagem("Hello X");
		
		EmailHandlerManager mgr = new EmailHandlerManager();
		mgr.addHandler(new PersonalEmailHandler());
		mgr.addHandler(new BusinessEmailHandler());
		
		mgr.send(e);
	}
}
