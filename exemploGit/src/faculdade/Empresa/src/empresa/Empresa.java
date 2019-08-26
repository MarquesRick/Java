package empresa;

/**
 * @author 0040961713001
 *
 */
public class Empresa {

    public static void main(String[] args) {
        Funcionario f; //Variável de instancia p/ classe Funcionario

        f = new Funcionario(); //Construtor New: Operador de instãncia
        
        f.setNome("José");
        f.setSalario(5000.00);
        
        System.out.println("Nome:" + f.getNome() + "\n" +
                "Salario:" + f.getSalario() + "\n");
        
       Fornecedor fo;
       
       fo = new Fornecedor();
       fo.setVendedor("João");
       fo.setFone("3457-8292");
       
       System.out.println("Vendedor: " + fo.getVendedor() + "\n" + 
               "Fone: " + fo.getFone() + "\n");
    }

}
