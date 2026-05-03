package ar.org.centro8.java.curso.sistema_bancario;

import ar.org.centro8.java.curso.sistema_bancario.cuentas.CajaAhorro;
import ar.org.centro8.java.curso.sistema_bancario.cuentas.Cheque;

import ar.org.centro8.java.curso.sistema_bancario.cuentas.CuentaConvertibilidad;
import ar.org.centro8.java.curso.sistema_bancario.cuentas.CuentaCorriente;
import ar.org.centro8.java.curso.sistema_bancario.personas.ClienteEmpresa;
import ar.org.centro8.java.curso.sistema_bancario.personas.ClienteIndividual;

public class TestSistemaBancario {
    public static void main(String[] args) {
        ClienteIndividual cliente1 = new ClienteIndividual(1, "Fabian", "Medina", "12345678");
        ClienteEmpresa cliente2 = new ClienteEmpresa(2, "Fravega", "30526874249");

        CajaAhorro cuenta1 = new CajaAhorro(1, 100000, 10, cliente1);
        CuentaCorriente cuenta2 = new CuentaCorriente(2,200000, 50000, cliente1);
        CuentaConvertibilidad cuenta3 = new CuentaConvertibilidad(3, 300000, 100000, cliente2,300);
        Cheque cheque1 = new Cheque("Galicia", "01/05/2026");
        Cheque cheque2 = new Cheque("Santander", "02/05/2026");
        Cheque cheque3 = new Cheque("ICBC", "03/05/2026");

        System.out.println("---------- TEST CajaAhorro ----------");

        System.out.println(cuenta1.getSaldoPesos()); 
        cuenta1.depositarEfectivo(10000);
        System.out.println(cuenta1.getSaldoPesos());
        cuenta1.extraerEfectivo(50000);
        System.out.println(cuenta1.getSaldoPesos());
        cuenta1.cobrarInteres();
        System.out.println(cuenta1.getSaldoPesos());
        cuenta1.extraerEfectivo(700000);
        System.out.println(cuenta1.getSaldoPesos());
        cuenta1.depositarEfectivo(0);
        cuenta1.depositarEfectivo(-10); 
        System.out.println(cuenta1.getSaldoPesos());

        System.out.println("---------- TEST CuentaCorriente ----------");

        System.out.println(cuenta2.getSaldoPesos());
        cuenta2.depositarEfectivo(10000);
        System.out.println(cuenta2.getSaldoPesos());
        cuenta2.extraerEfectivo(230000);
        System.out.println(cuenta2.getSaldoPesos());
        cuenta2.extraerEfectivo(300000);
        System.out.println(cuenta2.getSaldoPesos());
        cuenta2.depositarChequePesos(cheque1,100000);
        System.out.println(cuenta2.getSaldoPesos());

        System.out.println("---------- TEST CuentaConvertibilidad ----------");
        System.out.println( "###### PESOS ######");

        System.out.println(cuenta3.getSaldoPesos());
        cuenta3.depositarEfectivo(10000);
        System.out.println(cuenta3.getSaldoPesos());
        cuenta3.extraerEfectivo(360000);
        System.out.println(cuenta3.getSaldoPesos());
        cuenta3.extraerEfectivo(60000);
        System.out.println(cuenta3.getSaldoPesos());
        cuenta3.depositarChequePesos(cheque2,100000);
        System.out.println(cuenta3.getSaldoPesos());

        System.out.println( "###### DOLARES ######");

        System.out.println(cuenta3.getSaldoDolares());
        cuenta3.depositarDolares(100);
        System.out.println(cuenta3.getSaldoDolares());
        cuenta3.extraerDolares(50);   
        System.out.println(cuenta3.getSaldoDolares());
        cuenta3.depositarChequeDolares(cheque3,100);
        
        System.out.println("###### CONVERTIBILIDAD ######");
        System.out.println(cuenta3.getSaldoDolares());
        System.out.println(cuenta3.getSaldoPesos());
        cuenta3.convertirDolaresAPesos(50, 1390);
        System.out.println(cuenta3.getSaldoDolares());
        System.out.println(cuenta3.getSaldoPesos());
        cuenta3.convertirPesosADolares(69500, 1390);
        System.out.println(cuenta3.getSaldoDolares());
        System.out.println(cuenta3.getSaldoPesos());
    }
}

