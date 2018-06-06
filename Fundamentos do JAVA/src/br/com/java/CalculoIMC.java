package br.com.java;

import java.util.Scanner;

public class CalculoIMC {

	public static void main(String[] args) {
		// a linha abaixo cria variaveis numericas de precisão
		// float e double são tipos peritivos numéricos
		double peso, altura, imc;
		System.out.println("Digite o seu peso em KG: ");
		// entrada
		Scanner teclado = new Scanner(System.in);
		// a linha abaixo passa o valor digitado para a variavel peso
		peso = teclado.nextDouble();
		System.out.println("Digite a sua altura em metros: ");
		altura = teclado.nextDouble();
		// a linha abaixo faz o calculo de imc
		imc = peso / (altura * altura);
		System.out.println("O valor da sua massa corporal é: " + imc);

	}

}
