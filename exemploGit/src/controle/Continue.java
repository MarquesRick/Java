package controle;

/**
 * @author HENRIQUEMARQUES
 * 
 * @continue: Diferente do Break, o Continue pula apenas a estrutura e n�o o
 *            la�o todo.
 */

public class Continue {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			if (i == 2) {
				continue; // Neste caso o continue pular� o resultado '2', dando
							// sequencia no la�o de repeti�a�
			}

			System.out.println(i);
		}

		System.out.println("Fim..");
	}
}
