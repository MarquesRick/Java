package classe;

public class ValorVsReferencia {

	static void porValor(double numero){
		
		numero++;
		
	}
	
	static void porReferencia(Produto produto){
		produto.preco++;
		
	}
	
	public static void main(String[] args) {
		
		double numero = 1; 
		final Produto produto = new Produto("Caneta", 1); //constante
		Produto produto2 = produto; //Por referencia ele vai apontar para o mesmo espaço de memória.
		produto2.nome = "Lapis";
		//produto = new Produto(); //Criado um novo espaço de memória.
		
		porValor(numero);
		porReferencia(produto);
		System.out.println(numero);
		System.out.println(produto.preco);
		System.out.println(produto.nome);
	}
	
}
