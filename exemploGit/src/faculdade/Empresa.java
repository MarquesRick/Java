package faculdade;

public class Empresa {

	    public static void main(String[] args) {
	        Funcionario f, f1;//Vari�vel de instancia p/ classe Funcionario

	        f = new Funcionario("Jo�o", 5000); //Construtor New: Operador de inst�ncia
	        f1 = f;
	        f1.setNome("Jos�");
	        f = new Funcionario(f1); //Copy Construct
	        
	        /*System.out.println("Nome:" + f.getNome() + "\n" +
	                "Salario:" + f.getSalario() + "\n"); */

	        Fornecedor fo, for1;
	       
	       fo = new Fornecedor("Henrique","34576654");
	       for1 = new Fornecedor(fo); //Copy Construct
	       //fo.setVendedor("Jo�o");
	       //fo.setFone("3457-8292");
	       
	       fo.print();
	       f.print();
	       for1.print();
	    }

	}
