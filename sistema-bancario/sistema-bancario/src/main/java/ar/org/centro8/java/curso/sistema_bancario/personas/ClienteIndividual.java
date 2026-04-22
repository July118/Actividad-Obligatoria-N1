package ar.org.centro8.java.curso.sistema_bancario.personas;

import java.util.List;

import ar.org.centro8.java.curso.sistema_bancario.cuentas.Cuenta;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString (callSuper = true)
public class ClienteIndividual extends Cliente {
    private String nombre;
    private String apellido;
    private String dni;
    public ClienteIndividual(int numeroCliente, List<Cuenta> cuentas, String nombre, String apellido, String dni) {
        super(numeroCliente, cuentas);
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }
    
}
