package controle;

/**
 * 
 * @author HENRIQUEMARQUES
 *
 *         N�o recomend�vel usar, pois � muito semelhante a programa��o n�o
 *         estruturada (GoTo)
 */
public class BreakComRotulo {

	public static void main(String[] args) {
		externo: for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 2) {
					break externo; //Informa de qual la�o ele ir� sair
				}
				System.out.println("i = " + i + " " + "j = " + j);
			}
			
			System.out.println("Fim...");

		}
	}

}
