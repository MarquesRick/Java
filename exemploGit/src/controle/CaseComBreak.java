package controle;

public class CaseComBreak {
	public static void main(String[] args) {

		String conceito = "";
		int nota = -1;

		switch (nota) {
		case 10:
		case 9:
			conceito = "A";
			break;
		case 8:
		case 7:
			conceito = "B";
			break;
		case 6:
		case 5:
			conceito = "C";
			break;
		case 4:
		case 3:
			conceito = "D";
			break;
		case 2:
		case 1:
		case 0:
			conceito = "F";
			break;
		default:
			conceito = null;
			break;
		}

		if (conceito != null) {
			System.out.println("Valor do conceito é: " + conceito);
		} else {
			System.out.println("Digite um valor válido.");
		}
	}
}
