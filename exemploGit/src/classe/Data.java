package classe;

/**
 * @Construtor_Padrão = Contrutor que não recebe nenhum parametro na sua criação 
 * @author HENRIQUEMARQUES
 *
 */
public class Data {

	int dia;
	int mes;
	int ano;
	
	Data(){
		
		//Construtor Padrão
	}
	
	Data(int d, int m, int a){
		
		dia = d;
		mes = m; //Construtor com parametros.
		ano = a;
		
	}
	
	String formatar(){ //não é necessário colocar atributos se a função esteja dentro do objeto
		return String.format("%d/%d/%d", dia, mes, ano); //Metodo formatado
	}
}
