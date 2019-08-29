package classe;

/**
 * @Construtor_Padr�o = Contrutor que n�o recebe nenhum parametro na sua cria��o 
 * @author HENRIQUEMARQUES
 *
 */
public class Data {

	int dia;
	int mes;
	int ano;
	
	Data(){
		
		//Construtor Padr�o
	}
	
	Data(int d, int m, int a){
		
		dia = d;
		mes = m; //Construtor com parametros.
		ano = a;
		
	}
	
	String formatar(){ //n�o � necess�rio colocar atributos se a fun��o esteja dentro do objeto
		return String.format("%d/%d/%d", dia, mes, ano); //Metodo formatado
	}
}
