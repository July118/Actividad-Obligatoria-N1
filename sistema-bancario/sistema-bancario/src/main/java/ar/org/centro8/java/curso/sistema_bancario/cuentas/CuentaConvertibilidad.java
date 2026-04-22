package ar.org.centro8.java.curso.sistema_bancario.cuentas;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import ar.org.centro8.java.curso.sistema_bancario.personas.ClienteEmpresa;
@Getter
@Setter
@ToString (callSuper = true)
public class CuentaConvertibilidad extends CuentaCorriente{

    private ClienteEmpresa cliente;
    
    public CuentaConvertibilidad(int numeroCuenta, double saldo, String moneda, double montoDescubierto, ClienteEmpresa cliente) {
        super(numeroCuenta, saldo, moneda, montoDescubierto);
        this.cliente = cliente;
    }
    public double convertirPesosaDolares(double pesos, double cotizacionDolar){
        return pesos / cotizacionDolar;
    }
    public double convertirDolaresaPesos(double dolares, double cotizacionDolar){
          return dolares * cotizacionDolar;
    }
}
