package pessoa;

public class Heranca {
    
    public static void main(String[] args) {
        
        Pessoa ps = new Pessoa("Henrique", "422727507");
        Aluno al = new Aluno("42370339888", "000000", "00000");
        
        /**ps.setNome("João");
        ps.setRg("12345");
        
        al.setNome("Maria");  //construtor padrão
        al.setRg("34567");
        al.setRa("01234"); **/
        
        al.printAluno();
        ps.printPessoa();
    }
    

}
