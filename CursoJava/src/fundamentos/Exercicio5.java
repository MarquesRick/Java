package fundamentos;

import java.util.Scanner;

public class Exercicio5 {
	/**
	 * Criar um programa que leia o valor da base e da altura de um tri�ngulo e calcule a �rea.
	 */
	
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Digite o valor da base do triangulo: ");
	double base = scanner.nextDouble();
	
	System.out.println("Digite o valor da altura do triangulo: ");
	double altura = scanner.nextDouble();
	
	double area = (base * altura) / 2; 
	System.out.println("A �rea do triangulo �: " + area);
	
	scanner.close();
}
}
