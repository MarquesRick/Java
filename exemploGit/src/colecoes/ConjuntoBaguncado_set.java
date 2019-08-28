package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado_set {

	public static void main(String[] args) {
		Set conjunto = new HashSet();
		conjunto.add('a');
		conjunto.add("Texto");
		conjunto.add(1);
		conjunto.add(3.14);
		conjunto.add(false);
		
		System.out.println("Add..."); //Adicionar
		System.out.println(conjunto.add(1));
		System.out.println(conjunto.add(10));
		System.out.println("Size..." + conjunto.size());
		
		System.out.println("Remove..."); //Remover
		System.out.println(conjunto.remove('a'));
		System.out.println("Size..." + conjunto.size());
		
		System.out.println("Contains..."); //Se contém algum objeto desse tipo
		System.out.println(conjunto.contains('a'));
		System.out.println(conjunto.contains(1));
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);	
		nums.add(3);
			
		//conjunto.addAll(nums); //Adicionando dentro de conjunto a collection nums.
		
		conjunto.retainAll(nums); //Elemento comum das colecctions
		
		System.out.println("Size..." + conjunto.size());
		
		conjunto.clear(); //Limpar as collections
		System.out.println(conjunto.isEmpty()); //Mostra se a collection está vazia.
		
		
		
	}
}
