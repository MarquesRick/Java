package fundamentos;

/**
 * @author HENRIQUEMARQUES
 * @cast: Conversão Explicita (cast)
 */

public class ConvercaoNumerica {
	public static void main(String[] args) {
		//Exemplo 1 - Conversão Explicita
		float f = (float) 0.1;
		System.out.println(f);
		
		//Exemplo 2 - Conversão Explicita
		int i1 = (int) 7.9;
		System.out.println(i1);
		
		//Exemplo 3 - Conversão Implicita
		int i2 = 'a';
		System.out.println(i2);
		
		//Exemplo 4 - Conversão Implicita
		double d = 1001;
		System.out.println(d);
	}
}
