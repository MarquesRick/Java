package faculdade;

public class Empresa {

	    public static void main(String[] args) {
	        Funcionario f, f1; //Vari�vel de instancia p/ classe Funcionario

	        f = new Funcionario("Jo�o", 5000); //Construtor New: Operador de inst�ncia
	        f1 = f;
	        f1.setNome("Jos�");
	        
	        /*System.out.println("Nome:" + f.getNome() + "\n" +
	                "Salario:" + f.getSalario() + "\n"); */
	        f.print();

	        Fornecedor fo;
	       
	       fo = new Fornecedor("Henrique","34576654");
	       //fo.setVendedor("Jo�o");
	       //fo.setFone("3457-8292");
	       
	       fo.print();
	    }

	}
