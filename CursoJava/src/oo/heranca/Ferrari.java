package oo.heranca;

public class Ferrari extends Carro {
	// Alterado a velocidade máxima apenas da classe Ferrari, mantendo o da
	// classe Carro intacto
	public Ferrari() {
		
		VELOCIDADE_MAXIMA = 350;
	}
	
	public void acelerar(){
		super.acelerarMais(20); //Super: para acessar o método da classe pai.
	}
}
