package pessoa;

public class Aluno extends Pessoa{
    
    private String ra;
    
    public Aluno(Aluno al){
        super(al);
        ra = al.ra;
    }
    public void setRa(String ra){
            this.ra = ra;
        }
    public String getRa(){      //Construtor Padrão
    return ra; 
    }
    public Aluno(String nome, String rg, String ra){
        super(nome,rg);
        this.ra = ra;
    }
    public void printAluno(){
        printPessoa();
        System.out.println("RA: " + ra);
        
    } 
    
    
}
