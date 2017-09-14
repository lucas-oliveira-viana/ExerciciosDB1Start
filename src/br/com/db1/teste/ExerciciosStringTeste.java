package br.com.db1.teste;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.ExerciciosString;

public class ExerciciosStringTeste {

	private ExerciciosString exerciciosString = new ExerciciosString();

	@Test
	public void converterMaiuscula() {
		exerciciosString.converterMaiuscula();
		Assert.assertEquals("CARRO", exerciciosString.exibirPalavra());

	}

	@Test
	public void converterMinuscula() {
		exerciciosString.converterMinuscula();
		Assert.assertEquals("carro", exerciciosString.exibirPalavra());
	}

	@Test
	public void quantidadeLetras() {
		exerciciosString.quantidadeLetras();
		Assert.assertTrue(exerciciosString.quantidadeLetras() == 8);
	}

	@Test
	public void quantidadeLetras2() {
		exerciciosString.quantidadeLetras2();
		Assert.assertTrue(exerciciosString.quantidadeLetras2() == 10);
	}

	@Test
	public void quantidadeLetras3() {
		exerciciosString.quantidadeLetras3();
		Assert.assertTrue(exerciciosString.quantidadeLetras3() == 8);

	}

	@Test
	public void quatroLetras() {
		exerciciosString.quatroLetras();
		Assert.assertEquals("LUCA", exerciciosString.exibirPalavra());
	}

	@Test
	public void terceiraLetra() {
		exerciciosString.terceiraLetra();
		Assert.assertEquals("CAS DE OLIVEIRA VIANA", exerciciosString.exibirPalavra());
	}

	@Test
	public void ultimasLetras() {
		exerciciosString.ultimasLetras();
		Assert.assertEquals("IANA", exerciciosString.exibirPalavra());
	}

	@Test
	public void transformarNome() {
		exerciciosString.transformarNome();
		Assert.assertEquals("ALUNO", exerciciosString.exibirPalavra());
	}

	@Test
	public void transformarFrutas() {
		String[] frutas = exerciciosString.transformarFrutas();
		Assert.assertEquals(frutas[0], "banana");
		Assert.assertEquals(frutas[1], "maçã");
		Assert.assertEquals(frutas[2], "melancia");
	}

	@Test
	public void contarVogais() {
		Integer vogais = exerciciosString.contarVogais();
		Assert.assertTrue(2 == vogais);

	}
	
	@Test
	public void inverterPalavra(){
		Assert.assertEquals("sacul", exerciciosString.inverterPalavra());
	}
}
