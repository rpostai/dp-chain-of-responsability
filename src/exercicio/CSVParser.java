package exercicio;

import java.io.File;

public class CSVParser extends Parser {

	@Override
	public void parse(File file) {
		if (file.getName().endsWith(".csv")) {
			// processa o arquivo csv
			System.out.println("Processando arquivo CSV");
		}
		super.parse(file);
	}

}
