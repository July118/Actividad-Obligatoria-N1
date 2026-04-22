package ar.org.centro8.java.curso.sistema_bancario.cuentas;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public final class Cheque {
    private double monto;
    private String bancoEmisor;
    private Date fechaPago;
    
    public Cheque(double monto, String bancoEmisor, Date fechaPago) {
        this.monto = monto;
        this.bancoEmisor = bancoEmisor;
        this.fechaPago = fechaPago;
    }
 
}
