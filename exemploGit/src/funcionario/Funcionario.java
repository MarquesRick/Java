package funcionario;

public class Funcionario {
	
	String nome;
	String sobrenome;
	String rg;
	String eCivil;
	
	Funcionario(){
		
		//construtor padrao
	}
	
	Funcionario(String n, String s, String r, String e){
		
		nome = n;
		sobrenome = s; //Construtor com parametros.
		rg = r;
		eCivil = e;
		
	}
	
	public void print(){
		
		System.out.printf("Nome: %s\nSobrenome: %s\nRG: %s\nEstado Civil: %s\n"
				+ "*---------------------------------------------------------*\n", 
				nome, sobrenome, rg, eCivil);
	}
	
	
	

}
