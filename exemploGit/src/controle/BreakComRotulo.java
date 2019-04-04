package controle;

/**
 * 
 * @author HENRIQUEMARQUES
 *
 *         Não recomendável usar, pois é muito semelhante a programação não
 *         estruturada (GoTo)
 */
public class BreakComRotulo {

	public static void main(String[] args) {
		externo: for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 2) {
					break externo; //Informa de qual laço ele irá sair
				}
				System.out.println("i = " + i + " " + "j = " + j);
			}
			
			System.out.println("Fim...");

		}
	}

}
