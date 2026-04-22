package ar.org.centro8.java.curso.sistema_bancario.personas;

import java.util.List;

import ar.org.centro8.java.curso.sistema_bancario.cuentas.Cuenta;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString (callSuper = true)

public class ClienteEmpresa extends Cliente{
    private String nombreFantasia;
    private String cuit;
    
    public ClienteEmpresa(int numeroCliente, List<Cuenta> cuentas, String nombreFantasia, String cuit) {
        super(numeroCliente, cuentas);
        this.nombreFantasia = nombreFantasia;
        this.cuit = cuit;
    }
    
}
