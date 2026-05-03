package ar.org.centro8.java.curso.sistema_bancario.cuentas;

import ar.org.centro8.java.curso.sistema_bancario.personas.Cliente;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter

public abstract class Cuenta {
    private int numeroCuenta;
    private Cliente cliente;
    @Setter(AccessLevel.NONE)
    protected double saldoPesos;
    
    public Cuenta(int numeroCuenta, double saldoPesos, Cliente cliente) {
        this.numeroCuenta = numeroCuenta;
        this.saldoPesos = saldoPesos;
        this.cliente = cliente;
    }

    /**
     * Metodo que deposita dinero en efectivo en el saldo en pesos de la cuenta.
     * 
     * @param monto -> cantidad de dinero a depositar en pesos.
     */
    public void depositarEfectivo(double monto) {
        if (monto <= 0) {
        System.out.println("Error: por favor, deposite un monto mayor a cero");
        } else {
        saldoPesos += monto;
        System.out.println("Se depositaron $" + monto);
        }
    }

    /**
     * Metodo que extrae dinero en efectivo desde el saldo en pesos de la cuenta.
     * 
     * @param monto -> cantidad de dinero a extraer en pesos.
     */
    public void extraerEfectivo(double monto) {
        if (monto <= saldoPesos) {
            saldoPesos -= monto;
            System.out.println("Se extrajeron $" + monto);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}
