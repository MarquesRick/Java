package fundamentos;

import java.util.Scanner;

public class Exercicio1 {
	
	/** 1. Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit. */
	
	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.println("Digite a Temperatura em Celsius: ");
		 double celsius = scanner.nextDouble();
		 
		 double conversao = (celsius * 9/5) + 32;
		 
		 System.out.println("Valor em Farenheit: " + conversao);
		
		 scanner.close(); 
	}

}
