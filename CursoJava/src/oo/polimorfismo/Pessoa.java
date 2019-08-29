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
	
	/*public void comer(Arroz arroz){ //Polimorfismo est�tico - Sobrecarga de m�todo - Mesmo nome para duas funcionalidades diferentes 
		this.peso += arroz.getPeso(); //Para utiliza-lo deve alterar os atributos
	}
	
	public void comer(Feijao feijao){
		this.peso += feijao.getPeso();
	} -> POLIMORFISMO EST�TICO*/
	
	
	
	//M�todo VarArgs
	public void comer(Comida... comidas){ 
		for(Comida c: comidas){
		this.peso += c.getPeso(); //POLIMORFISMO DIN�MICO
	}
}
}
