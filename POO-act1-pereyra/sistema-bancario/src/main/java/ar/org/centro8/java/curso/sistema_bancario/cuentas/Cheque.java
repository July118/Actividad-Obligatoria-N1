package ar.org.centro8.java.curso.sistema_bancario.cuentas;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public final class Cheque {
    private String bancoEmisor;
    private String fechaPago;
    
    public Cheque(String bancoEmisor, String fechaPago) {
        this.bancoEmisor = bancoEmisor;
        this.fechaPago = fechaPago;
    }
}
