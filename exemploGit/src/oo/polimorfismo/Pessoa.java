package oo.polimorfismo;

/**
 * @author HENRIQUEMARQUES
 * Peso em KG
 */
public class Pessoa {
 
	private double peso = 0;
	
	public Pessoa(double pesoInicial){
		this.peso = pesoInicial;
	}
	
	public double getPeso(){
		return peso;
	}
	
	/*public void comer(Arroz arroz){ //Polimorfismo estático - Sobrecarga de método - Mesmo nome para duas funcionalidades diferentes 
		this.peso += arroz.getPeso(); //Para utiliza-lo deve alterar os atributos
	}
	
	public void comer(Feijao feijao){
		this.peso += feijao.getPeso();
	} -> POLIMORFISMO ESTÁTICO*/
	
	
	
	//Método VarArgs
	public void comer(Comida... comidas){ 
		for(Comida c: comidas){
		this.peso += c.getPeso(); //POLIMORFISMO DINÂMICO
	}
}
}
