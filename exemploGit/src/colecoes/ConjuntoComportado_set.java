package colecoes;
/*
 * @Set: N�o aceita objetos duplicados
 * @Tipo de Set:

@Hashset: n�o aceita ordena��o nem ordem natural de inser��o - Sorteado os dados
@LinkedHashset: Ordena pela ordem de inser��o.
@Treeset: Ordena pela ordem Alfab�tica. 
 */

import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado_set {

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
