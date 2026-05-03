package ar.org.centro8.java.curso.sistema_bancario.personas;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString (callSuper = true)

public class ClienteEmpresa extends Cliente{
    private String nombreFantasia;
    private String cuit;
    
    public ClienteEmpresa(int numeroCliente, String nombreFantasia, String cuit) {
        super(numeroCliente);
        this.nombreFantasia = nombreFantasia;
        this.cuit = cuit;
    }
    
}
