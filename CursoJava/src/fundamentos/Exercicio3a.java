package fundamentos;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicio3a {
	/**
	 * Criar um programa que leia o peso e a altura do usuário e imprima no
	 * console o IMC. Utilizando System.out.println
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Entre com sua Altura: ");
		double altura = scanner.nextDouble();
		double alturaQ = (altura * altura);

		System.out.println("Entre com o seu peso: ");
		double peso = scanner.nextDouble();

		double imc = (peso / alturaQ);
		System.out.printf("Seu IMC é: %.2f %n\n", imc);

		scanner.close();

		String resultado = imc > 24.99 ? "Obesidade" : "Normal";
		System.out.println("A sua situação Corporal é: " + resultado);

	}

}
