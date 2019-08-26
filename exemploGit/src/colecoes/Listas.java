package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Listas {
	
	public static void main(String[] args) {
		List<String> aprovados = new ArrayList<>();
		aprovados.add("Joao");
		aprovados.add("Pedro");
		aprovados.add("Maria");
		
		System.out.println("Get...");
		System.out.println(aprovados.get(1));
		
		System.out.println(aprovados.add("Maria"));
		System.out.println("Size..." + aprovados.size());
		
		System.out.println(aprovados.remove("maria"));
		System.out.println("Size..." + aprovados.size());
		
		System.out.println(aprovados.remove("Maria"));
		System.out.println("Size..." + aprovados.size());
		System.out.println("................//................");
		
		
		for(String nome: aprovados){
			System.out.println(nome);
		}
		
	}

}
