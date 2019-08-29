package classe;

public class Produto {

	String nome;
	double preco;
	static double desconto; //Static: uma unica c�pia para toda a classe.
	
	Produto(){
		//construtor padr�o
	}
	
	Produto(String nome, double preco){
		
		this.nome = nome;
		this.preco = preco; //Construtor quando as variaveis s�o diferentes (string, int, double etc..)
		//this.desconto = desconto; = N�o necess�rio definir por conta do static
		
	}
	
	double precoSemDesconto(){
		return preco;
	}
	double precoComDesconto(){
		
		
		 return Math.floor(preco - preco * desconto);
		 
		
	}
}


