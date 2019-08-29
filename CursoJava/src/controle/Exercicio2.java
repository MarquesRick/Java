package controle;

import java.util.Scanner;

//Criar um programa informa se o ano atual é um ano bissexto;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite algum ano:");
		int ano = scanner.nextInt();
		
		int bissexto =+ ano % 4;
		
		if(bissexto == 0){
			System.out.println(ano + " é um ano bissexto");
		} else{
			System.out.println(ano + " Não é um ano bissexto");
		}
		
		scanner.close();
		
		
	}
}
