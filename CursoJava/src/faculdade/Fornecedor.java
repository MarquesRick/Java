package faculdade;

/**
 *
 * @author 0040961713001
 */
public class Fornecedor {

	private String vendedor;
	private String fone;

	public void setVendedor(String valVendedor) {
		if (!valVendedor.isEmpty()) {
			vendedor = valVendedor;
		}

	}

	public void setFone(String valFone) {
		if (!valFone.isEmpty()) {
			fone = valFone;
		}
	}

	public String getVendedor() {
		return vendedor;
	}

	public String getFone() {
		return fone;
	}

	public Fornecedor(String valVendedor, String valFone) {

		vendedor = valVendedor;
		fone = valFone;

	}

	public void print() {

		System.out.println("Vendedor: " + getVendedor() + "\n" + "Fone: " + getFone() + "\n");
	}

	public Fornecedor(Fornecedor for1) {

		vendedor = for1.vendedor;
		fone = for1.fone;
	}
}
