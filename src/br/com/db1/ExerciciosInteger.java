package br.com.db1;

public class ExerciciosInteger {

	private Double resultado;

	public Double getResultado() {
		return resultado;
	}

	public void setResultado(Double resultado) {
		this.resultado = resultado;
	}

	public void somar(Double valor1, Double valor2) {
		resultado = valor1 + valor2;

	}

	public void subtrair(Double valor1, Double valor2) {
		resultado = valor1 - valor2;

	}

	public void dividir(Double valor1, Double valor2) {
		resultado = valor1 / valor2;
	}

	public void multiplicar(Double valor1, Double valor2) {
		resultado = valor1 * valor2;

	}

	public Double exibirResultado() {
		return resultado;

	}

	public boolean numeroPar(Double valor) {
		if (valor % 2 == 0)
			return true;
		else
			return false;

	}

	public void numeroMaior(Double valor1, Double valor2) {
		if (valor1 > valor2)

			resultado = valor1;

		while (valor2 > valor1)

			resultado = valor2;

	}

	public Double[] imparesAteCem(Double valor) {
		Double[] impares = new Double[50];
		Integer contador = 0;
		if (valor < 100) {
			for (Double x = valor; x < 100; x++) {
				if (x % 2 != 0) {
					impares[contador] = x;
					contador++;
					System.out.println(x);
				}

			}
		}

		return impares;

	}
}
