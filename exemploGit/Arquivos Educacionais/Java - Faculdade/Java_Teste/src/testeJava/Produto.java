package testeJava;

public class Produto {
	
	String modelo;
	String marca;
	int codigo;
	double preco;
	
	public Produto produto() {
        return this;
    }
	
	public String getModelo() { return this.modelo; }
    public String getMarca() { return this.marca; }
    public int getCodigo() { return this.codigo; }
    public double getPreco() { return this.preco; }
 
    public void setModelo (String modelo) { this.modelo = modelo; }
    public void setMarca (String marca) { this.marca = marca; }
    public void setCodigo (int codigo) { this.codigo = codigo; }
    public void setPreco (double preco) { this.preco = preco; }
}

