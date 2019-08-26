package empresa;

/**
 * @author 0040961713001 - Henrique Marques
 * @Setter: São métodos especializados em atribuir valores para os atributos
 * permitindo que seja feita a validação dos valores.
 * @Getters: São métodos feitos para retornar valores dos atributos.
 */
public class Funcionario {

    private String nome;
    private double salario;

    public void setNome(String valNome) {
        if (!valNome.isEmpty()) {
            nome = valNome;
        }
    }

    public void setSalario(double valSalario) {
        if (valSalario > 0) {
            salario = valSalario;
        }
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }
}//Funcionario
