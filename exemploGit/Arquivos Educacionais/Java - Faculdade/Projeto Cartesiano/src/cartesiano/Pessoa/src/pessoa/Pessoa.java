package pessoa;

public class Pessoa {
    
        private String nome, rg;
        
        public Pessoa(Pessoa ps){
            
            nome = ps.nome; //construtor
            rg = ps.rg;
            
           this.nome = nome;   //Construtor 
            this.rg = rg; 
        }
       public void setNome(String nome){
            this.nome = nome;
        }
        public String getNome(){
            return nome;            //Construtor padrão
        }
        public void setRg(String rg){
            this.nome = rg;
        }
        public String getRg(){
            return rg;
        } 
        public void printPessoa(){
            System.out.println(nome + " " + rg);
        }
        
        public Pessoa(String nome, String rg){
            this.nome = nome;
            this.rg = rg;
        }
    }
    

