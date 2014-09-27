package exercicio;

import java.io.File;

public class Parser {

	private Parser sucessor;

	public void parse(File file) {
		if (sucessor != null) {
			sucessor.parse(file);
		} else {
			System.out
					.println("Fim");
		}
	}
	
	public void setSucessor(Parser sucessor) {
		this.sucessor = sucessor;
	}

}
