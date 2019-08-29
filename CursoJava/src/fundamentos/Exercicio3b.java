package fundamentos;

import javax.swing.JOptionPane;

public class Exercicio3b {
	/**
	 * Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.
	 * Utilizando JOptionPane
	 */	
public static void main(String[] args) {

	String altura1 = JOptionPane.showInputDialog("Entre com sua Altura:", "Digite sua altura aqui");
	double altura = Double.parseDouble(altura1);
	
	double alturaQ = (altura * altura);
	
	String peso1 = JOptionPane.showInputDialog("Entre com o seu peso: ", "Digite seu peso aqui");
	double peso = Double.parseDouble(peso1);
	
	double imc = (peso/alturaQ);
	String msg = String.format("Seu IMC é: %.2f", imc); //Formatando as casas decimais para o JOptionPane
	JOptionPane.showMessageDialog(null, msg);
	
	
	String resultado = imc > 24.99 ? "Obesidade" : "Normal"; //Operador Ternário
	JOptionPane.showMessageDialog(null, "A sua situação Corporal é: \n" + resultado);
	
	
}
	
}


