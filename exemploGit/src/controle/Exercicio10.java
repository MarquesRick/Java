package controle;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int matriz[] = new int[10];
		
		for(int i = 0; i < 10; i++){
			System.out.printf("Digite um valor para o N%d\n", i+1);
			int num = scanner.nextInt();
			matriz[i] = num;
		}
		
		Arrays.sort(matriz); //Lista o array do maior para o menor;
		
		int maior = matriz[9];//o maior valor fica na última posição
		int menor = matriz[0];// e o menor na primeira
		System.out.println("Maior = " + maior + "\nMenor = " + menor + "\nDiferença = " + (maior-menor));
		scanner.close();
	}
	
	
	
}
