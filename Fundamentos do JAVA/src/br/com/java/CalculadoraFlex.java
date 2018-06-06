package br.com.java;

import java.util.Scanner;

public class CalculadoraFlex {

	public static void main(String[] args) {
		double alcool, gasolina, resultado;
		Scanner teclado = new Scanner(System.in);
		System.out.println("");
		System.out.println("Digite o valor do álcool: ");
		alcool = teclado.nextDouble();
		System.out.println("Digite o valor da gasolina: ");
		gasolina = teclado.nextDouble();
		gasolina = (alcool / gasolina);
		System.out.println("Resultado: " + gasolina);
		if (gasolina < 0.7 ) {
			System.out.println("Abasteça com álcool");
		} else {
			System.out.println("Abasteça com gasolina");
		}
	}

}
