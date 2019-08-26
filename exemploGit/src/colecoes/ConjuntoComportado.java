package colecoes;

import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		Set<String> aprovados = new TreeSet<>(); //TreeSet aplica ordenação alfabetica ou númerica
												//LinkedSet<>(); Aplica ordenação por inserção
		aprovados.add("Maria");
		aprovados.add("João");
		aprovados.add("Paulo");
		
		for(String nome: aprovados){
			System.out.println(nome);
		}
		
		System.out.println(aprovados);
		
	}
}
