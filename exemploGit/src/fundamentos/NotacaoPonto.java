package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {

		/**
		 * @Replace: altera um dado pelo outro("?" para: "Henrique").
		 */
		
		
		/* Separando em varias sentenças de código:
		 * String s = "Bom dia ?".toUpperCase();
		 * s = s.replace("?", "Henrique");
		 * s = s.concat("!");
		 * System.out.println(s);
		 */
		
		String s = "Bom dia ?".toUpperCase().replace("?", "Henrique").concat("!");
		System.out.println(s);
	}
}
