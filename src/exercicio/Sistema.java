package exercicio;

import java.io.File;

public class Sistema {

	public static void main(String[] args) {
		Parser p = new CSVParser();
		p.setSucessor(new JSONParser());
		p.parse(new File("teste.csv"));
		
		p.parse(new File("teste.json"));
	}

}
