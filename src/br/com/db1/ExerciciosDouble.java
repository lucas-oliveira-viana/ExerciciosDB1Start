package br.com.db1;

public class ExerciciosDouble {

	private Double resultado;

	public Double exibirResultado() {
		return resultado;

	}

	public void menorValor(Double valor1, Double valor2) {
		if (valor1 < valor2)

			resultado = valor1;

		while (valor2 < valor1)

			resultado = valor2;

	}

	public void menorValorTres(Double valor1, Double valor2, Double valor3) {
		if (valor1 < valor2 && valor1 < valor3)

			resultado = valor1;

		else if (valor2 < valor3)

			resultado = valor2;

		else

			resultado = valor3;

	}

	public void mediaValores(Double valor1, Double valor2, Double valor3) {
		Double soma;
		soma = valor1 + valor2 + valor3;
		resultado = soma / 3;
	}
	
	public void areaTriangulo(Double valor1, Double valor2){
		Double base = valor1;
		Double altura = valor2;
		resultado = base * altura / 2;
		
	}

	public Double getResultado() {
		return resultado;
	}

	public void setResultado(Double resultado) {
		this.resultado = resultado;
	}
}
