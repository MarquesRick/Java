package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		fila.offer("Maria"); //Offer faz a mesma coisa que o método "Add"
		fila.offer("João");
		fila.offer("Pedro");
		
		System.out.println("Peek/Element..." );
		System.out.println(fila.peek()); //retorna o elemento objeto da fila - Peek retorna Null quando o elemento não está na fila
		System.out.println(fila.element()); //Retorna erro quando a fila está vazia
		
		System.out.println("Poll/Remove");
		System.out.println(fila.poll());//Remove o primeiro indice 
		System.out.println(fila.remove());
		System.out.println(fila.poll());
		System.out.println(fila.poll());//Retorna Null quando o elemento não está na fila
		System.out.println(fila.remove());//Retorna erro quando a fila está vazia
		
	}
}
