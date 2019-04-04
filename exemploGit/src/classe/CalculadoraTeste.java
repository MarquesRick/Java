package classe;

public class CalculadoraTeste {
	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora();
		
		calc.somar(10, 5);
		calc.printar();
		calc.acrescentar(10);
		calc.printar();
		calc.limpar();
		calc.printar();
		calc.obterResultado();
		calc.printar();
	}
}
