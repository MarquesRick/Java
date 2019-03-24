package fundamentos;

public class OperadoresAritmeticos {
	public static void main(String[] args) {
		int num1 = 3;
		int num2 = 4;
		int num3 = 5;

		// Operadores: + - * / %
		int soma = num1 + num2 + num3 + 6; // Da esquerda para direita
		System.out.println(soma);
		System.out.println(num1 - num2 - num3);

		// Cuidado com a precedencia (sentido das operações)
		System.out.println(num1
				+ num3 * num2 / 2); /*
									 * Sera realizado primeiro a multiplicação
									 * depois a divisao e por ultimo a soma
									 */

		System.out.println((num1 + num3) * num2 / 2); // Forma correta

		// Resto da divisão
		System.out.println(10 % 2); /*
									 * Formula muito utilizada para saber se um
									 * numero é impar ou par
									 */
		System.out.println(13 % 2);
	}

}
