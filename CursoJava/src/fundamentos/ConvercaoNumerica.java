package fundamentos;

/**
 * @author HENRIQUEMARQUES
 * @cast: Convers�o Explicita (cast)
 */

public class ConvercaoNumerica {
	public static void main(String[] args) {
		//Exemplo 1 - Convers�o Explicita
		float f = (float) 0.1;
		System.out.println(f);
		
		//Exemplo 2 - Convers�o Explicita
		int i1 = (int) 7.9;
		System.out.println(i1);
		
		//Exemplo 3 - Convers�o Implicita
		int i2 = 'a';
		System.out.println(i2);
		
		//Exemplo 4 - Convers�o Implicita
		double d = 1001;
		System.out.println(d);
	}
}
