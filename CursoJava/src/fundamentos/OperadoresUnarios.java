package fundamentos;

public class OperadoresUnarios {
	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 2;

		// Incrementando e decrementando
		num1++;
		System.out.println(num1);
		--num1;
		System.out.println(num1);

		System.out.println(++num1 == num2--); // Pessimo m�todo de programar,
												// n�o incrementar/Descrementar
												// depois da variavel
		System.out.println(num1 == num2);

		// complemeento bin�ro
		System.out.println(Integer.toBinaryString(50));
		System.out.println(Integer.toBinaryString(~50)); // "~" para alterar
															// todo o bin�rio

		// Nega��o
		System.out.println(!true);
	}
}
