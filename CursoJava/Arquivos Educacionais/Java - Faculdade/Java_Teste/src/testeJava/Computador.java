package testeJava;

public class Computador extends Produto {

	String processador;
	String memoria;

	@Override
	public String toString() {
		return processador + memoria + preco + codigo;
	} 
	
	public String getProcessador() { return this.processador; }
	public String getMemoria() { return this.memoria; }
	
	public void setProcessador(String processador) { this.processador = processador;}
	public void setMemoria(String memoria) { this.memoria = memoria;}
}