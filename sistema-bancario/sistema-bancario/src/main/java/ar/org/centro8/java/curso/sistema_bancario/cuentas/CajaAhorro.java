package ar.org.centro8.java.curso.sistema_bancario.cuentas;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString (callSuper = true)
public class CajaAhorro extends Cuenta{
    
    private double tasaInteres;

    public CajaAhorro(int numeroCuenta, double saldo, String moneda, double tasaInteres) {
        super(numeroCuenta, saldo, moneda);
        this.tasaInteres = tasaInteres;
    }

    public void cobrarInteres(double porcentaje){
         double interes = saldo * porcentaje / 100;
         saldo += interes;
         
         System.out.println("Interés cobrado: $" + interes);
         System.out.println("Nuevo saldo: $" + saldo);
    }
}
