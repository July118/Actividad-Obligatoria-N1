package ar.org.centro8.java.curso.sistema_bancario.cuentas;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString (callSuper = true)
public class CuentaCorriente extends Cuenta {
    private double MontoDescubierto;

    public CuentaCorriente(int numeroCuenta, double saldo, String moneda, double montoDescubierto) {
        super(numeroCuenta, saldo, moneda);
        MontoDescubierto = montoDescubierto;
    }

    public void depositarCheque (Cheque cheque){
        saldo += cheque.getMonto();
        System.out.println("Cheque depositado correctamente");
    }
}
