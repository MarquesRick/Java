package colecoes;
/*
 * @Set: Não aceita objetos duplicados
 * @Tipo de Set:

@Hashset: não aceita ordenação nem ordem natural de inserção - Sorteado os dados
@LinkedHashset: Ordena pela ordem de inserção.
@Treeset: Ordena pela ordem Alfabética. 
 */

import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado_set {

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
