package br.com.java;

import java.util.Scanner;

public class ConversorDeRealParaDolar {

	public static void main(String[] args) {
		double dolar, real;
		dolar = 3.73;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o valor do Real: ");
		real = teclado.nextDouble();
		real = real * dolar;
		System.out.println("Valor do Dólar: " + 3.73 );
		System.out.println("Valor do Real em Dólar: " + real );

	}

}
