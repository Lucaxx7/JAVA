package br.com.java;

import java.util.Scanner;

public class OperadoresAritm�ticos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float x = 10;
		float y = 3;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Operadores Aritm�ticos");
		System.out.println("Digite o valor de x: ");
		x = teclado.nextFloat();
		System.out.println("Digite o valor de y: ");
		y = teclado.nextFloat();
		// Soma
		System.out.println("x + y =" + (x + y));
		// Subtra��o
		System.out.println("x - y =" + (x - y));
		// Divis�o
		System.out.println("x / y =" + (x / y));
		// Multiplica��o
		System.out.println("x * y =" + (x * y));
		// M�dulo (usado para obter o resto da divis�o
		System.out.println("x % y =" + (x % y));
		// Incremento x++ ( equivalea x = x + 1)
		x++;
		System.out.println("x++ " + x);
		// Decremento y-- ( equivale a y = y - 1)
		y--;
		System.out.println("y--" + y);
		
		}
		

}
