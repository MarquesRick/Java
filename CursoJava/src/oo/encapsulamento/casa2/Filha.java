package oo.encapsulamento.casa2;

import oo.encapsulamento.casa1.Sogra;
import oo.encapsulamento.casa1.Sogro;

public class Filha extends Sogra {

	String segredoDoCasal = "Meu marido está quase sendo demitido";
	
	public static void main(String[] args) {
		Filha euMesma = new Filha();
		System.out.println("Meus pais não sabem... " + euMesma.segredoDoCasal);
		
		Sogro papai = new Sogro();
		System.out.println(papai.gostaDeCerveja);
		
		/*Sogra mamae = new Sogra();
		System.out.println(mamae.); */
		
		System.out.println(euMesma.segredoDeFamilia);
	}
}
