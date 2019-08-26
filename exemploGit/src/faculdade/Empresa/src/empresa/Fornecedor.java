package empresa;

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
        if(!valFone.isEmpty()) {
            fone = valFone;
        }
    }
    
     public String getVendedor() {
        return vendedor;
    }

    public String getFone() {
        return fone;
    }
}

