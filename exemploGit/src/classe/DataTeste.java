package classe;

public class DataTeste {
	public static void main(String[] args) {
		Data nascimento = new Data(); //Construtor padrão.
		nascimento.dia = 9;
		nascimento.mes = 6;
		nascimento.ano = 1995; 
		
		/**System.out.println(nascimento.dia + "/" + nascimento.mes + "/" + nascimento.ano);
		System.out.printf("%d/%d/%d", nascimento.dia, nascimento.mes, nascimento.ano); **/
		
		Data casamento = new Data(18, 9, 2016); //Construtor não padrão, com atributos.
		
		System.out.println(nascimento.formatar());
		System.out.println(casamento.formatar());
		System.out.println("Teste");
	}
	
}
