package oo.exemplo.moto;

public class Cb1000 extends Moto{

	public Cb1000(){
		velocidadeMaxima = 1000;
	}
	
	public void acelerarMais(){
		
		super.acelerar(20);
	}

	public void frearMais(){
		super.frear(10);
	}
}
