package br.com.db1;

public class ExerciciosString {

	private String palavra;

	public String exibirPalavra() {
		return palavra;

	}

	public void converterMaiuscula() {
		palavra = "carro";
		palavra = palavra.toUpperCase();
		System.out.println(palavra.toUpperCase());

	}

	public void converterMinuscula() {
		palavra = "CARRO";
		palavra = palavra.toLowerCase();
		System.out.println(palavra.toLowerCase());
	}

	public Integer quantidadeLetras() {
		palavra = "DB1START";
		return palavra.length();

	}

	public Integer quantidadeLetras2() {
		palavra = " DB1START ";
		return palavra.length();
	}

	public Integer quantidadeLetras3() {
		palavra = " DB1START ";
		return palavra.trim().length();

	}

	public String quatroLetras() {
		palavra = "LUCAS";
		palavra = palavra.substring(0, 4);
		return palavra.substring(0, 4);

	}

	public String terceiraLetra() {
		palavra = "LUCAS DE OLIVEIRA VIANA";
		palavra = palavra.substring(2).trim();
		return palavra.substring(2).trim();

	}

	public String ultimasLetras() {
		palavra = "LUCAS DE OLIVEIRA VIANA";
		palavra = palavra.substring(palavra.length() - 4);
		return palavra.substring(palavra.length() - 4);
	}

	public String transformarNome() {
		palavra = "LUCAS DE OLIVEIRA VIANA";
		palavra = palavra.replaceAll("LUCAS DE OLIVEIRA VIANA", "ALUNO");
		return palavra.replaceAll("LUCAS DE OLIVEIRA VIANA", "ALUNO");
	}

	public String[] transformarFrutas() {
		palavra = "banana,maçã,melancia";
		return palavra.split(",");

	}

	public Integer contarVogais() {
		palavra = "lucas";
		Integer vogais = 0;
		for (Integer x = 0; x < palavra.length(); x++) {
			String letra = palavra.substring(x, x+1);
			if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u"))
				vogais++;
		}
		return vogais;
	}

	public String inverterPalavra() {
		palavra = "lucas";
		if ((null == palavra) || (palavra.length() <= 1)) {
			return palavra;
		}
		return new StringBuffer(palavra).reverse().toString();
	}

}
