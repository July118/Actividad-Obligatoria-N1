package ar.org.centro8.java.curso.sistema_bancario.cuentas;

import ar.org.centro8.java.curso.sistema_bancario.personas.Cliente;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString (callSuper = true)
public class CajaAhorro extends Cuenta{
    
    private double tasaInteres;

    public CajaAhorro(int numeroCuenta, double saldoPesos, double tasaInteres, Cliente cliente) {
        super(numeroCuenta, saldoPesos, cliente);
        this.tasaInteres = tasaInteres;
    }

    /**
     * Metodo que calcula y acredita el interés sobre el saldo en pesos de la cuenta.
     * El interés se calcula como un porcentaje del saldo actual
     * y se suma automáticamente al mismo.
     */
    public void cobrarInteres(){
         double interes = saldoPesos * tasaInteres / 100;
         saldoPesos += interes;
         
         System.out.println("Interés cobrado: $" + interes);
    }
}
