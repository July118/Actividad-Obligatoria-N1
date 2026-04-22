package ar.org.centro8.java.curso.sistema_bancario.personas;

import java.util.ArrayList;
import java.util.List;

import ar.org.centro8.java.curso.sistema_bancario.cuentas.Cuenta;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public abstract class Cliente {
    private final int numeroCliente;
    private List<Cuenta> cuentas;
  
    public Cliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
        this.cuentas = new ArrayList<>();
    }

    public final void agregarCuenta(Cuenta cuenta){
        cuentas.add(cuenta);
    }
}

