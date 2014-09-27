package exercicio;

import java.io.File;

public class JSONParser extends Parser {

	@Override
	public void parse(File file) {
		if (file.getName().endsWith("json")) {
			// processa o arquivo Json
			System.out.println("Processando arquivo JSON");
		}
		super.parse(file);
	}

}
