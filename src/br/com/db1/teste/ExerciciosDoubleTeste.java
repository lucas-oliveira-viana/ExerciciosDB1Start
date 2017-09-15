package br.com.db1.teste;


import org.junit.Test;

import br.com.db1.ExerciciosDouble;
import junit.framework.Assert;

public class ExerciciosDoubleTeste {

	private ExerciciosDouble exerciciosDouble = new ExerciciosDouble();

	@Test
	public void menorValor() {
		exerciciosDouble.menorValor(2d, 3d);
		Assert.assertTrue(exerciciosDouble.exibirResultado() == 2d);
	}
	
	@Test
	public void menorValorTres() {
		exerciciosDouble.menorValorTres(4d, 7d, 8d);
		Assert.assertTrue(exerciciosDouble.exibirResultado() == 4d);
	}
	
	@Test
	public void mediaValores() {
		exerciciosDouble.mediaValores(3d, 5d, 7d);
		Assert.assertTrue(exerciciosDouble.exibirResultado() == 5d);
	}
	
	@Test
	public void areaTriangulo(){
		exerciciosDouble.areaTriangulo(6d, 8d);
		Assert.assertTrue(exerciciosDouble.exibirResultado() == 24d);
	}
}
