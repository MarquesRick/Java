package colecoes;

public class Array {

	public static void main(String[] args) {
		double [] notasJoao = {7.0, 8.7, 6.2, 4.9, 9.7};
		
		double [] notasPedro = new double [5]; //Outra forma de definir, apenas colocando o numero de indices (tamanho fixo)
		
		notasPedro[0] = 1.0;
		notasPedro[1] = 2.0;
		notasPedro[2] = 3.0;
		notasPedro[3] = 4.0;
		notasPedro[4] = 5.0;
		
		double totalJoao = 0;
		for(int i = 0; i < notasJoao.length; i++){
			totalJoao += notasJoao[i];
		}
	
	
	double totalPedro = 0;
	for(int i = 0; i < notasPedro.length; i++){
		totalPedro += notasPedro[i];
	}
	
	System.out.println(totalJoao / notasJoao.length);
	System.out.println(totalPedro / notasPedro.length);
	}
}

