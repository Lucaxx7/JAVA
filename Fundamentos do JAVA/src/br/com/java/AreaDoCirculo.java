package br.com.java;

import java.util.Scanner;

public class AreaDoCirculo {

	public static void main(String[] args) {
	double pi, area, raio;
	Scanner teclado = new Scanner (System.in);
	pi = 3.14;
	System.out.println("Digite aqui o raio: ");
	raio = teclado.nextDouble();
	raio = raio * raio;
	System.out.println("valor do raio: " + raio );
	System.out.println("Área do Círculo: " + raio * pi);
	area = (raio * pi);
	
	

	}

}
