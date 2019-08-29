package api;

public class ExplorandoMath {

	public static void main(String[] args) {
		
		// sin, cos, tag, log...
		System.out.println(Math.PI); //valor de PI
		System.out.println(Math.pow(2, 3)); //2 é a base, 3 é o expoente
		System.out.println(Math.abs(-10.5)); //Altera o valor de: Negativo para: Positivo
		System.out.println(Math.min(70, 7)); //Retorna o menor valor
		System.out.println(Math.max(70, 7)); //Retorna o maior vendedor
		System.out.println(Math.ceil(6.55)); //Arredonda pra cima
		System.out.println(Math.floor(6.55)); //Arredonda pra baixo
		System.out.println(Math.random()); //Retorna valor aleatorio
		
		//Retorna valor aleatorio
		double numAleatorio = Math.random();
		System.out.println("Número gerado: " + numAleatorio);
		      
		// Gerar os 5 números aleatórios e mostrá-los:
		for (int i = 0; i < 5; i++) {
			int numAleatorio2 = (int)(Math.random() * 10 ) + 1;
			System.out.println("Número: " + numAleatorio2);
		}
	}
}
