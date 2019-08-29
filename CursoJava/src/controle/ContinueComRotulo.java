package controle;

/*
 * Não é recomendável usar rótulos.
 */

public class ContinueComRotulo {

	public static void main(String[] args) {

		externo: for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 2) {
					continue externo; // Neste caso, o valor de j == 2 não será
										// imprimido pulando para j == 3
				}

				System.out.println("i = " + i + " " + "j = " + j);
			}
			System.out.println("Fim...");
		}
	}
}