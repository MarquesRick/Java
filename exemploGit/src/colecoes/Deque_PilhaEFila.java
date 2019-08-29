package colecoes;

import java.util.Stack;

/*
 * @Ctrl + O -> importa os Import para o projeto
 * @Ctrl + shift + F -> Formatação do código
 */
public class Deque_PilhaEFila {

	public static void main(String[] args) {
		Stack<String> pilha = new Stack<>();

		pilha.push("Filme1"); // Metodo Push coloca o elemento na pilha
		pilha.push("Filme2");
		pilha.push("Filme3");

		System.out.println(pilha);

		System.out.println("Peek.."); // Pegar sem tirar o elemento da fila
		System.out.println(pilha.peek());

		System.out.println("Pop..."); // Pegar o elemento do topo e remover da
										// pilha
		System.out.println(pilha.pop());
		System.out.println(pilha.pop());
		System.out.println(pilha.pop());
	}
}
