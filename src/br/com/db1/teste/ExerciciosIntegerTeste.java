package br.com.db1.teste;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.ExerciciosInteger;

public class ExerciciosIntegerTeste {

	private ExerciciosInteger exerciciosInteger = new ExerciciosInteger();

	@Test
	public void somarTest() {
		exerciciosInteger.somar(2d, 7d);
		Assert.assertTrue(exerciciosInteger.exibirResultado() == 9d);

	}

	@Test
	public void subtrairTest() {
		exerciciosInteger.subtrair(14d, 7d);
		Assert.assertTrue(exerciciosInteger.exibirResultado() == 7d);
	}

	@Test
	public void dividirTest() {
		exerciciosInteger.dividir(10d, 2d);
		Assert.assertTrue(exerciciosInteger.exibirResultado() == 5d);

	}

	@Test
	public void multiplicarTest() {
		exerciciosInteger.multiplicar(5d, 10d);
		Assert.assertTrue(exerciciosInteger.exibirResultado() == 50d);

	}

	@Test
	public void numeroParTest() {
		exerciciosInteger.numeroPar(8d);
		Assert.assertTrue(exerciciosInteger.exibirResultado() == 8d % 2d);

	}

	@Test
	public void numeroMaior() {
		exerciciosInteger.numeroMaior(8d, 4d);
		Assert.assertTrue(exerciciosInteger.exibirResultado() == 8d);

	}

	@Test
	public void imparesAteCem() {
		Double[] impares = exerciciosInteger.imparesAteCem(95d);
		Assert.assertTrue(impares[0] == 95d);
		Assert.assertTrue(impares[1] == 97d);
		Assert.assertTrue(impares[2] == 99d);

	}

}
