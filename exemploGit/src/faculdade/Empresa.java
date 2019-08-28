package faculdade;

public class Empresa {

	    public static void main(String[] args) {
	        Funcionario f, f1; //Variável de instancia p/ classe Funcionario

	        f = new Funcionario("João", 5000); //Construtor New: Operador de instãncia
	        f1 = f;
	        f1.setNome("José");
	        
	        /*System.out.println("Nome:" + f.getNome() + "\n" +
	                "Salario:" + f.getSalario() + "\n"); */
	        f.print();

	        Fornecedor fo;
	       
	       fo = new Fornecedor("Henrique","34576654");
	       //fo.setVendedor("João");
	       //fo.setFone("3457-8292");
	       
	       fo.print();
	    }

	}
