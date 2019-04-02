package controle;
/*
 * Criar um programa que enquanto estiver recebendo números positivos, imprime no console
 * a soma dos números inseridos, caso receba um número negativo, encerre o programa. 
 * Tente utilizar a estrutura do while. 
 */

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int contadorNumeros = 0;
		int soma = 0;
		
		while(contadorNumeros >= 0){
			System.out.println("Digite um numero (negativo para sair):");
			contadorNumeros = scanner.nextInt();
			if(contadorNumeros >= 0){
				
				soma += contadorNumeros;
				System.out.printf("A soma até o momento é: %d\n", soma);
			} else{
				System.out.println("Saindo...");
			}
		}
		
		scanner.close();
		
		
	}
}
