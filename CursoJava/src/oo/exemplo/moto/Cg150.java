package oo.exemplo.moto;

public class Cg150 extends Moto{

	public Cg150(){
		
		velocidadeMaxima = 120;
	}
	
	public void acelerarMais(){
		super.acelerar(10);
	}
	
	public void frearMais(){
		super.frear(3);
	}
}
