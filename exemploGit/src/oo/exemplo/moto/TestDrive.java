package oo.exemplo.moto;

public class TestDrive{

	public static void main(String[] args) {
		
		Moto moto = new Cb1000();
		moto.acelerarMais();
		moto.acelerarMais();
		moto.acelerarMais();
		moto.acelerarMais();
		moto.acelerarMais();
		moto.frearMais();
		System.out.println("CB1000: " + moto.getVelocidadeAtual());
		
		moto = new Cb300();
		moto.acelerarMais();
		moto.acelerarMais();
		moto.acelerarMais();
		moto.acelerarMais();
		moto.acelerarMais();
		moto.acelerarMais();
		moto.acelerarMais();
		moto.acelerarMais();
		moto.frearMais();
		System.out.println("CB300: " + moto.getVelocidadeAtual());
		
		moto = new Cg150();
		moto.acelerarMais();
		moto.acelerarMais();
		moto.acelerarMais();
		moto.acelerarMais();
		moto.acelerarMais();
		moto.frearMais();
		System.out.println("CG150: " + moto.getVelocidadeAtual());
		
	}
}
