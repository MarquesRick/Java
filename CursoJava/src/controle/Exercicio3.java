package controle;

import java.util.Scanner;

/*
 * 3. Criar um programa que receba duas notas parciais, calcular a meÌ�dia final. 
 * Se a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado", 
 * se a nota for menor que 7.0 e maior do que 4.0 imprime no console "RecuperacÌ§aÌƒo", 
 * caso contraÌ�rio imprime no console "Reprovado". 
 */

public class Exercicio3 {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a Primeira nota:");
		double fnota = scanner.nextDouble();
		
		System.out.println("Digite a segunda nota:");
		double lnota = scanner.nextDouble();
		
		double unota = (fnota + lnota) / 2;
		
		if(unota >= 7){
			System.out.println("Aprovado");
		}
		else if(unota >= 4){
			System.out.println("RecuperaÃ§Ã£o");
		} else{
			System.out.println("Reprovado");
		}
		
		scanner.close();
	}

}
