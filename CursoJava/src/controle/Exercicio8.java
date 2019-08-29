package controle;

import java.util.Scanner;

/*
 * Criar um programa que receba uma palavra e imprime no console letra por letra. 
 */
public class Exercicio8 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite uma palavra:");
		String texto = scanner.nextLine();
		
		char letras[] = texto.toCharArray();
		
		for(int i = 0; i < letras.length; i++){
			System.out.println(letras[i]);
		}
		
		scanner.close();
		
	}
}
