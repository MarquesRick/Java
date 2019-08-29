package controle;

import java.util.Scanner;

/*Crie um programa que recebe 10 valores e ao final imprima o maior número. 
 * 
 */
public class Exercicio9 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	int maiorValor = 0;
	int contador = 0;
	
	do{
		System.out.println("Entre com algum valor: ");
		int valor = scanner.nextInt();
		
		if(valor > maiorValor){
			maiorValor = valor;
		}
		
		contador++;
		 	 	
	}while(contador != 10);

	System.out.println("Maior valor: " + maiorValor);
	scanner.close();
}
}
