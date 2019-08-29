package api;

public class ExplorandoMath {

	public static void main(String[] args) {
		
		// sin, cos, tag, log...
		System.out.println(Math.PI); //valor de PI
		System.out.println(Math.pow(2, 3)); //2 � a base, 3 � o expoente
		System.out.println(Math.abs(-10.5)); //Altera o valor de: Negativo para: Positivo
		System.out.println(Math.min(70, 7)); //Retorna o menor valor
		System.out.println(Math.max(70, 7)); //Retorna o maior vendedor
		System.out.println(Math.ceil(6.55)); //Arredonda pra cima
		System.out.println(Math.floor(6.55)); //Arredonda pra baixo
		System.out.println(Math.random()); //Retorna valor aleatorio
		
		//Retorna valor aleatorio
		double numAleatorio = Math.random();
		System.out.println("N�mero gerado: " + numAleatorio);
		      
		// Gerar os 5 n�meros aleat�rios e mostr�-los:
		for (int i = 0; i < 5; i++) {
			int numAleatorio2 = (int)(Math.random() * 10 ) + 1;
			System.out.println("N�mero: " + numAleatorio2);
		}
	}
}
