package controle;

import java.util.Scanner;

/*
 * Criar um programa que receba um número e diga se ele é um número primo. 
 */

public class Exercicio4 {
	
public static void main(String[] args) {
	
	int contadorDeDivisores = 0;
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Digite um número");
	int number = scanner.nextInt();
	
	for(int i = 2; i < number; i++){
		if(number % 1 == 0){
			contadorDeDivisores++;
		}
	}
	
	if(contadorDeDivisores == 0){
		
		System.out.println(number + ": Numero é primo!");
	} else{
		System.out.println(number + ": Numero não é primo!");
	}
	
	scanner.close();
}
}
