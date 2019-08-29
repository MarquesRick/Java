package oo.exemplo.moto;

public class Moto {

	protected int velocidadeMaxima = 300;
	private int velocidadeAtual = 0;

	protected final void acelerar(int velocidade) {

		if (velocidadeAtual > velocidadeMaxima) {
			velocidadeAtual = velocidadeMaxima;
		} else {
			velocidadeAtual += velocidade;
		}
	}

	protected final void frear(int velocidade) {
		if (velocidadeAtual - velocidade < 0) {
			velocidadeAtual = 0;
		} else {
			velocidadeAtual -= velocidade;
		}
	}

	public void acelerarMais() {
		acelerar(10);
	}
	
	public void frearMais(){
		frear(6);
	}
	
	public int getVelocidadeAtual(){
		return velocidadeAtual;
	}
}
