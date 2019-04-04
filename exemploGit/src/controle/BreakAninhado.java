package controle;

public class BreakAninhado {
	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			if (i == 1) {
				break;
			}
			for (int n = 0; n < 5; n++) {
				if (n == 3) {
					break;
				}
				for (int j = 0; j < 5; j++) {
					if (j == 2) {
						break; // Break está relacionado ao for interno, por
								// tanto o for externo continuará processando
					}

					System.out.println("i = " + i + " " + "n = " + n + " " + "j = " + j);
				}
			}
		}
		System.out.println("fim..");
	}
}
