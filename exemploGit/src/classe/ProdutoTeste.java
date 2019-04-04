package classe;

/**
 * @Static = Instancia de uma classe, que poder� ser acessada pelo nomeDaClasse.variavel.
 * Ao definir uma v�riavel como static, ao muda-la, o valor dela no objeto tamb�m ser� alterada.
 * @author HENRIQUEMARQUES
 *
 */

public class ProdutoTeste {
 public static void main(String[] args) {
	
	 Produto produto1 = new Produto(); //Construtor padr�o;
	 produto1.nome = "Notebook Acer";
	 produto1.preco = 2300;
	 //produto1.desconto = 0.05;
	 
	 Produto produto2 = new Produto("Caneta BIC", 2.83); //Construtor com atributos; Static anula o terceiro parametro
	 
	 Produto.desconto = 0.15; //Necess�rio colocar o nome da classe por ser Static o tipo da v�riav�l
	 
	 System.out.println(produto1.precoSemDesconto());
	 System.out.println(produto1.precoComDesconto());
	 
	 System.out.println(produto2.precoSemDesconto());
	 System.out.println(produto2.precoComDesconto());
	 
}
}
