package br.com.studiotrek;

import java.util.Arrays;

public class TemaCharp implements TemaFlyweight {

	@Override
	public void imprime(String titulo, String texto) {
		System.out.println("########## " + titulo + " ##########");
		System.out.println(texto);
		char[] rodape = new char[22 + titulo.length ()];
		Arrays.fill(rodape, '#');
		System.out.println(rodape);
	}

}
