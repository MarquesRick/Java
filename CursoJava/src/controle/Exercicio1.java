package controle;

import java.util.Scanner;

//1. Criar um programa que receba um nuumero e verifique se ele está entre 0 e 10 e eeh par; 

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite algum número");
		int numero = scanner.nextInt();
		
		if(numero >= 0 && numero <= 10){
			System.out.println("Numero está entre 0 a 10");
		} else{
			System.out.println("Numero não está entre 0 a 10");
		}
		
		int ver = numero;
		
		if(ver % 2 == 1){
			
			System.out.println("Numero impar");
			
		} else{
			System.out.println("Numero par");
		}
		
		scanner.close();

		
		
		
		
		
	}
}
