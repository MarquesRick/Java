package api;

public class ExplorandoString {

	public static void main(String[] args) {
		String nome = new String("Henrique Marques");
		nome = "Henri" + "que";
		
		//Alguns métodos
		System.out.println(nome.toUpperCase()); //Deixa as palavras em Maisculo
		System.out.println(nome.toLowerCase()); ///Deixa as palavras em minusculo
		System.out.println(nome.substring(0, 3)); //Pega as letras dos parametros passado - entre primeira posição e terceira posição
		System.out.println(nome.indexOf('n'));//Pega a posição que está o caracter passado
		System.out.println(nome.charAt(6));//Pega o caracter na posição passada
		//faz uma comparação da string passada para o valor da string, ignorando maiuscula ou miniscula
		System.out.println(nome.equalsIgnoreCase("henrique"));
		System.out.println(nome.startsWith("Hen"));//Compara o valor passado se o mesmo começa com os caracteres
		System.out.println(nome.endsWith("rique"));//Compara o valor passado se o mesmo termina com os caracteres
		System.out.println(nome.isEmpty());//Verifica se a string está vazia
		System.out.println(nome.concat(" é legal!").concat("?"));//concatena com os caracteres passados
		
		//A string é imutável
		System.out.println(nome);//Mesmo após todas as alterações, o valor é o mesmo.
		
		//Para mudar seu valor, apenas atribuindo em sua variável a operação, exemplo:
		nome = nome.toUpperCase().substring(3, 8).concat(" é legal");
		System.out.println(nome);
		
	}
}
