package br.com.java;

import java.util.Scanner;

public class PDV {

	public static void main(String[] args) {
		double pre�o = 0, desconto, valorpago, troco, total;
		Scanner teclado = new Scanner (System.in);
		System.out.println("pre�o: ");
		pre�o = teclado.nextDouble();
		//entrada
		System.out.println("% de desconto: ");
		desconto = teclado.nextDouble();
		total = pre�o - ((pre�o * desconto) / 100);
		System.out.println("pre�o total: " + total);
		//processamento
		System.out.println("Valor Pago: ");
		valorpago = teclado.nextDouble();
		//saida
		troco = ( valorpago - total);
		System.out.println("Troco: " + troco);
				
		
		
		
	}

}
