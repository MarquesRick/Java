package colecoes;

import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		Set<String> aprovados = new TreeSet<>(); //TreeSet aplica ordena��o alfabetica ou n�merica
												//LinkedSet<>(); Aplica ordena��o por inser��o
		aprovados.add("Maria");
		aprovados.add("Jo�o");
		aprovados.add("Paulo");
		
		for(String nome: aprovados){
			System.out.println(nome);
		}
		
		System.out.println(aprovados);
		
	}
}
