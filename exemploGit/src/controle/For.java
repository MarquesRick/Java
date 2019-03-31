package controle;

import java.util.Scanner;

public class For {
	 public static void main(String[] args) {
		 
		 Scanner scanner = new Scanner(System.in);
		 
		 double nota = 0;
		 double somaDasNotas = 0;
		 
		 for(int indice = 0; indice < 3; indice++){
			
			 nota = scanner.nextDouble();
			 somaDasNotas += nota;
		 }
		 
		 scanner.close();
		 System.out.printf("A média das notas é: %.2f", somaDasNotas / 3);
	}
}
