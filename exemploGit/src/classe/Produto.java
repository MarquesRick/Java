package classe;

public class Produto {

	String nome;
	double preco;
	static double desconto; //Static: uma unica cópia para toda a classe.
	
	Produto(){
		//construtor padrão
	}
	
	Produto(String nome, double preco){
		
		this.nome = nome;
		this.preco = preco; //Construtor quando as variaveis são diferentes (string, int, double etc..)
		//this.desconto = desconto; = Não necessário definir por conta do static
		
	}
	
	double precoSemDesconto(){
		return preco;
	}
	double precoComDesconto(){
		
		
		 return Math.floor(preco - preco * desconto);
		 
		
	}
}


