package fundamentos;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o valor de A: ");
		int a = scanner.nextInt();
		
		System.out.println("Informe o valor de B: ");
		int b = scanner.nextInt();
		
		System.out.println("Informe o valor de C: ");
		int c = scanner.nextInt();
		System.out.printf("*------------------------*----------------------------*");
		
		System.out.printf("\nSua equação é: %dx² + %dx + %d = 0\n", a, b, c);
		System.out.printf("*------------------------*----------------------------*\n");
		
		int delta = (int) (Math.pow(b, 2) - 4 * a * c);
		System.out.println("O valor de Delta é: " + delta);
		
		double x1 = (-b + Math.sqrt(delta)) / (2 * a);
		double x2 = (-b - Math.sqrt(delta)) / (2 * a); 
		
		System.out.println("O valor de X1 é: " + x1);
		System.out.println("O valor de X2 é: " + x2);
		
		scanner.close();
		
	}
}
