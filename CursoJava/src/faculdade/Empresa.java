package faculdade;

public class Empresa {

	    public static void main(String[] args) {
	        Funcionario f, f1;//Variável de instancia p/ classe Funcionario

	        f = new Funcionario("João", 5000); //Construtor New: Operador de instãncia
	        f1 = f;
	        f1.setNome("José");
	        f = new Funcionario(f1); //Copy Construct
	        
	        /*System.out.println("Nome:" + f.getNome() + "\n" +
	                "Salario:" + f.getSalario() + "\n"); */

	        Fornecedor fo, for1;
	       
	       fo = new Fornecedor("Henrique","34576654");
	       for1 = new Fornecedor(fo); //Copy Construct
	       //fo.setVendedor("João");
	       //fo.setFone("3457-8292");
	       
	       fo.print();
	       f.print();
	       for1.print();
	    }

	}
