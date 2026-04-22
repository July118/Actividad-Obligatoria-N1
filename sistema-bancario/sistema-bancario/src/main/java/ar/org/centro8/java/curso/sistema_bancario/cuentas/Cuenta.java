package ar.org.centro8.java.curso.sistema_bancario.cuentas;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public abstract class Cuenta {
    private final int numeroCuenta;
    protected double saldo;
    private final String moneda;

    public final void depositar(double monto) {
        saldo += monto;
        System.out.println("Se depositaron $" + monto);
    }

    public final void extraer(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
            System.out.println("Se extrajeron $" + monto);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}
