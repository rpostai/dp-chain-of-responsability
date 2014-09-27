package exemplo;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class BusinessEmailHandler extends EmailHandler {

	@Override
	public void handleRequest(Email email) {
		System.out.println("Tratando email Bussines Email Handler");
		if (email.getRemetente().contains("minhaempresa.com")) {
			FileOutputStream fos;
			try {
				fos = new FileOutputStream(new File("/emails_monitorados.txt"));
				ObjectOutputStream os = new ObjectOutputStream(fos);
				os.writeObject(email);
				os.flush();
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		super.handleRequest(email);
	}

}
