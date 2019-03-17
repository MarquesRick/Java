package fundamentos;

public class ConversaoNumeroString {
	public static void main(String[] args) {
		
		//Conversao Objeto Primitivo
		Integer num1 = 1000;
		System.out.println(num1.toString());
		System.out.println(num1.toString().length());
		
		//Conversao Tipo primitivo
		int num2 = 1000;
		System.out.println(Integer.toString(num2));
		System.out.println(Integer.toString(num2).length());
		
		//Conversao concatenada (menos utilizavel)
		System.out.println(("" + num2).length());
	}
}
