package colecoes;

public class EnderecoTeste {
	public static void main(String[] args) {
		Endereco endereco1 = new Endereco("Rua XV de Novembro", 467, "Sala 20");
		Endereco endereco2 = new Endereco("Rua XV de Novembro", 467, "Sala 20");
		
		System.out.println(endereco1 == endereco2);
		System.out.println(endereco1.equals(endereco2));
	}
}