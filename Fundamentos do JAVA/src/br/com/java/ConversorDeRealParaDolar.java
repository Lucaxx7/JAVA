package br.com.java;

import java.util.Scanner;

public class ConversorDeRealParaDolar {

	public static void main(String[] args) {
		double dolar, real;
		Scanner teclado = new Scanner(System.in);
		dolar = teclado.nextDouble();
		System.out.print("Digite o valor do Dólar: ");
		real = teclado.nextDouble();
		real = real * dolar;
		System.out.println("Valor do Dólar: " + 3.73 );
		System.out.println("Valor do Dólar em Real: " + real );

	}

}
