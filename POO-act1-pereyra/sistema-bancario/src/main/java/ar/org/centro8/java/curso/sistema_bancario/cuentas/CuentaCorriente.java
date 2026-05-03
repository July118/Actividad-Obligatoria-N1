package ar.org.centro8.java.curso.sistema_bancario.cuentas;

import ar.org.centro8.java.curso.sistema_bancario.personas.Cliente;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString (callSuper = true)
public class CuentaCorriente extends Cuenta {

    private double montoDescubierto;

    public CuentaCorriente(int numeroCuenta, double saldoPesos, double montoDescubierto, Cliente cliente) {
        super(numeroCuenta, saldoPesos, cliente);
        this.montoDescubierto = montoDescubierto;
    }

    /**
     * Metodo que extrae dinero en efectivo desde el saldo en pesos de la cuenta
     * permitiendo operar en descubierto hasta el límite autorizado.    
     */

    @Override
    public void extraerEfectivo(double monto) {
         if (monto <= saldoPesos + montoDescubierto) {
        saldoPesos -= monto;
        System.out.println("Se extrajeron $" + monto);
        } else {
        System.out.println("Supera el límite de descubierto");
        }
    }

    /**
     * Metodo que permite depositar un cheque en pesos en la cuenta
     * 
     * @param cheque -> cheque a depositar.
     * @param monto -> valor del cheque que se agregara al saldo en pesos.
     */
    public void depositarChequePesos(Cheque cheque, double monto){
        if (monto <= 0) {
        System.out.println("Error: por favor, deposite un monto mayor a cero");
        } else {
        saldoPesos += monto;
        System.out.println("Se deposito un cheque por $" + monto);
        }
    }
}
