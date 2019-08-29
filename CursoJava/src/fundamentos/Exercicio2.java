package fundamentos;

import java.util.Scanner;

public class Exercicio2 {
	
	/** Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius. */
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Digite a temperatura em Fahrenheit: ");
	double fahrenheit = scanner.nextDouble();
	
	double conversao = ((fahrenheit - 32) * 5/9);
	System.out.println("A temperatura em Celsius é: " + (Math.round(conversao)));
	
	scanner.close();
}
}
