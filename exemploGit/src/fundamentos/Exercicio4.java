package fundamentos;

import java.util.Scanner;

public class Exercicio4 {
	/**
	 * Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor.
	 */
	
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Digite um valor");
	double num1 = scanner.nextDouble();
	
	double quadrado = Math.pow(num1, 2);
	
	double cubo = Math.pow(num1, 3);
	
	System.out.printf("O Resultado ao Quadrado é: " + quadrado);
	System.out.printf("\nO Resultado ao cubo é: " + cubo);
	
	scanner.close();
	
}
}
