package controle;

/**
 * @author HENRIQUEMARQUES
 * Sem break ele verifica em
 * qual a senten�a se
 * enquadra e executa case
 * por case ap�s o que ele
 * se enquadra
 */


public class CaseSemBreak {
	public static void main(String[] args) {
		String faixa = "amarela";

		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sou faixa preta");
		case "marrom":
			System.out.println("sou faixa marrom"); 
		case "roxa":
			System.out.println("Sou faixa roxa");
		case "verde":
			System.out.println("Sou faixa verde");
		case "laranja":
			System.out.println("Sou faixa larana");
		case "vermelha":
			System.out.println("Sou faixa vermeha");
		case "amarela":
			System.out.println("Sou faixa amarela");
		default:
			System.out.println("N�o sei nada");
		}

	}
}
