package testeJava;

import java.util.ArrayList;

public class Core {

	public static ArrayList<Computador> lc = new ArrayList<Computador>();

	public static void main(String[] args) {

		CarregaDados();
		
		System.out.println("Iniciando saporra..");
		
		for(int i = 0; i < lc.size(); i++){
			
			System.out.println(lc.get(i));
		}
		
	}

	public static void CarregaDados() {

		Computador c1 = new Computador();

		c1.setProcessador("AMD");
		c1.setMemoria("1TB");
		c1.setCodigo(01);
		c1.setMarca("Acer");
		c1.setModelo("ES - 1516");
		c1.setPreco(1290.99);
		
		lc.add(c1);
		
		Computador c2 = new Computador();

		c2.setProcessador("Intel i5");
		c2.setMemoria("1TB");
		c2.setCodigo(02);
		c2.setMarca("Lenovo");
		c2.setModelo("L - 15");
		c2.setPreco(1399.99);
		
		lc.add(c2);
		
		Computador c3 = new Computador();

		c3.setProcessador("Intel i7");
		c3.setMemoria("500GB");
		c3.setCodigo(03);
		c3.setMarca("Positivo");
		c3.setModelo("P - 69");
		c3.setPreco(798.99);
		
		lc.add(c3);
		
		
	}

}
