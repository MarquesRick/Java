package api;

public class ExplorandoString {

	public static void main(String[] args) {
		String nome = new String("Henrique Marques");
		nome = "Henri" + "que";
		
		//Alguns m�todos
		System.out.println(nome.toUpperCase()); //Deixa as palavras em Maisculo
		System.out.println(nome.toLowerCase()); ///Deixa as palavras em minusculo
		System.out.println(nome.substring(0, 3)); //Pega as letras dos parametros passado - entre primeira posi��o e terceira posi��o
		System.out.println(nome.indexOf('n'));//Pega a posi��o que est� o caracter passado
		System.out.println(nome.charAt(6));//Pega o caracter na posi��o passada
		//faz uma compara��o da string passada para o valor da string, ignorando maiuscula ou miniscula
		System.out.println(nome.equalsIgnoreCase("henrique"));
		System.out.println(nome.startsWith("Hen"));//Compara o valor passado se o mesmo come�a com os caracteres
		System.out.println(nome.endsWith("rique"));//Compara o valor passado se o mesmo termina com os caracteres
		System.out.println(nome.isEmpty());//Verifica se a string est� vazia
		System.out.println(nome.concat(" � legal!").concat("?"));//concatena com os caracteres passados
		
		//A string � imut�vel
		System.out.println(nome);//Mesmo ap�s todas as altera��es, o valor � o mesmo.
		
		//Para mudar seu valor, apenas atribuindo em sua vari�vel a opera��o, exemplo:
		nome = nome.toUpperCase().substring(3, 8).concat(" � legal");
		System.out.println(nome);
		
	}
}
