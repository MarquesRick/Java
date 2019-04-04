package controle;

/**
 * @author HENRIQUEMARQUES
 * @breakpoint: Clicando no canto teremos o ponto de parada.
 * @debug: F11 = Debug F6 = Será executado passo a passo Ctrl + shift + i =
 *         mostra o resultado do código selecionado até o momento do debug passo
 *         a passo.
 */

public class Break {
	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			if (i == 2) {
				break; // Break interrompera o 'for' assim que a condição ser
						// executada
			}

			System.out.println(i);
		}
		System.out.println("Fim..");
	}
}
