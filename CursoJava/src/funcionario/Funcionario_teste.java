package funcionario;

public class Funcionario_teste {
	public static void main(String[] args) {
		
		//Construtor Padrão
		Funcionario vendedor = new Funcionario(); 
		
		vendedor.nome = "José";
		vendedor.sobrenome = "Ribeiro";
		vendedor.rg = "70596758988";
		vendedor.eCivil = "Solteiro";
		//*******************************************************//
		
		//Construtor com atributos
		Funcionario logista = new Funcionario("Anderson", "Tavares", "56498563422", "Casado");
		Funcionario almoxarife = new Funcionario("Claudio", "Da Silva Marques", "472292275077", "Casado");
		vendedor.print();
		logista.print();
		almoxarife.print();
	}
}
