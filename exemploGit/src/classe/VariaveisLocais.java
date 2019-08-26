package classe;

public class VariaveisLocais {

	int a = 2;
	int a1 = 2;
	
	void teste1(){
		int a1 = 2;
		System.out.println(a);
		System.out.println(a1);
		
		if(a1 > 3){
			int a2 = 3; //Variavel não possivel acessa fora do escopo de void
		}
		
		//System.out.println(a2); //Não é possivel acessar uma variavel que foi definida dentro de um escopo local
	}
	
	void teste2(){
		int a1 = 7;
		System.out.println(this.a1); //Vai trazer a variavel do escopo global, valor fora do metodo void.
		System.out.println(a1); //Vai trazer o valor da variavel dentro do escopo local (7).
		
	}
	
}
