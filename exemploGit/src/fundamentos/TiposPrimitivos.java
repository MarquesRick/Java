package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {

		// Tipo primitivo booleano
		boolean bo1 = false;
		boolean bo2 = true;
		System.out.printf("%b %b\n", bo1, bo2);

		// Tipo primitivo caracter
		char c1 = 'a';
		char c2 = '!';
		char c3 = '\u0050'; // barra 'u' para imprimir/atribuir caracteres do
							// tipo unicode
		System.out.printf("%c %c %c\n", c1, c2, c3);

		// Tipo primitivo inteiros
		byte b = 127; // Só permite o tamando de até 127 e -128
		short s = 32767; // Tamando máximo permitido
		int i = 2_147_483_647; // '_' para deixar mais legivel
		long l = 9223372036854775807L; /*coloca-se 'L' no final do número para
										* informar que é um long (e vai além do
										máximo permitido em um int. 
										*/ 
		System.out.printf("%d %d %d %d\n", b, s, i, l);
		
		// Imprime em binarios
		System.out.println(Integer.toBinaryString(b));
		System.out.println(Integer.toBinaryString(s));
		System.out.println(Integer.toBinaryString(i));
		System.out.println(Long.toBinaryString(l));
		
		// Tipos primitivos reais (ponto flutuante)
		
		float f = 3.1416F; //Necessário colocar o 'F' no final para informar que é do tipo Float
		double d = 2.45;
		
		// '%.2f' limita o valor para 2 casas decimais
		System.out.printf("%.2f %.1f", f, d);

	}
}
