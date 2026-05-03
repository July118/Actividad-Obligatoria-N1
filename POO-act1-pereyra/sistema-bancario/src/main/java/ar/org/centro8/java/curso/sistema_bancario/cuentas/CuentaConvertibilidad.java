package ar.org.centro8.java.curso.sistema_bancario.cuentas;

import ar.org.centro8.java.curso.sistema_bancario.personas.ClienteEmpresa;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString (callSuper = true)
public class CuentaConvertibilidad extends CuentaCorriente{
    
    private double saldoDolares;
    
    public CuentaConvertibilidad(int numeroCuenta, double saldoPesos, double montoDescubierto, ClienteEmpresa cliente,
        double saldoDolares) {
    super(numeroCuenta, saldoPesos, montoDescubierto, cliente);
    this.saldoDolares = saldoDolares;
    }
    
     /**
     * Metodo que deposita dinero en efectivo en el saldo en dolares de la cuenta.
     * 
     * @param monto -> cantidad de dinero a depositar en dolares.
     */
    public void depositarDolares(double monto) {
        if (monto <= 0) {
        System.out.println("Error: por favor, deposite un monto mayor a cero");
        } else {
        saldoDolares += monto;
        System.out.println("Se depositaron $" + monto);
        }
    }

    /**
     * Metodo que extrae dinero en efectivo del saldo en dolares de la cuenta.
     * 
     * @param monto -> cantidad de dinero a extraer en dolares.
     */
    public void extraerDolares(double monto) {
        if (monto <= saldoDolares) {
            saldoDolares -= monto;
            System.out.println("Se extrajeron $" + monto);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    /**
     * Metodo que convertierte una cantidad de pesos a dolares utilizando una tasa de cambio.
     * 
     * @param montoPesos -> cantidad de pesos a convertir.
     * @param tasa -> valor de un dolar expresado en pesos.
     */
    public void convertirPesosADolares(double montoPesos, double tasa) {
        if (montoPesos <= saldoPesos) {
            saldoPesos -= montoPesos;
            saldoDolares += montoPesos / tasa;
            System.out.println("Conversión realizada a dólares");
        } else {
            System.out.println("Saldo en pesos insuficiente");
        }
    }

    /**
     * Metodo que convierte una cantidad de dolares a pesos utilizando una tasa de cambio
     * 
     * @param montoDolares -> cantidad de dolares a convertir.
     * @param tasa -> valor de un dolar expresado en pesos.
     */
    public void convertirDolaresAPesos(double montoDolares, double tasa) {
        if (montoDolares <= saldoDolares) {
            saldoDolares -= montoDolares;
            saldoPesos += montoDolares * tasa;
            System.out.println("Conversión realizada a pesos");
        } else {
            System.out.println("Saldo en dólares insuficiente");
        }
    }

     /**
     * Metodo que permite depositar un cheque en dolares en la cuenta
     * 
     * @param cheque -> cheque a depositar
     * @param monto -> valor del cheque que se agregara al saldo en dolares.
     */
    public void depositarChequeDolares(Cheque cheque, double monto) {
        if (monto <= 0) {
        System.out.println("Error: por favor, deposite un monto mayor a cero");
        } else {
        saldoDolares += monto;
        System.out.println("Se deposito un cheque por $" + monto);
        }
    }

    
} 
