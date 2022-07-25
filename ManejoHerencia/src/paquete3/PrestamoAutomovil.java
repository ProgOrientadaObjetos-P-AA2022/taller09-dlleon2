/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import paquete2.Persona;
import paquete2.Prestamo;

public class PrestamoAutomovil extends Prestamo{
    
    private String tipoAuto;
    private String marcaAuto;
    private Persona garante1;
    private double valorAuto;
    private double valorMesPagoPrestamoAuto;

    public PrestamoAutomovil(String tA, String mA, Persona g, double vA,
          Persona b, int t, String c) {
        super(b,t,c);    
        tipoAuto = tA;
        marcaAuto = mA;
        garante1 = g;
        valorAuto = vA;
    }

    
    public void establecerTipoAuto(String tA) {
        tipoAuto = tA;
    }

    public void establecerMarcaAuto(String mA) {
        marcaAuto = mA;
    }

    public void establecerGarante1(Persona g) {
        garante1 = g;
    }

    public void establecerValorAuto(double vA) {
        valorAuto = vA;
    }

    public void establecerValorMesPagoPrestamoAuto() {
        valorMesPagoPrestamoAuto = valorAuto / tiempoPrestamo;
    }

    public String obtenerTipoAuto() {
        return tipoAuto;
    }
    public String obtenerMarcaAuto() {
        return marcaAuto;
    }
    public Persona obtenerGarante1() {
        return garante1;
    }
    public double obtenerValorAuto() {
        return valorAuto;
    }
    public double obtenerValorMesPagoPrestamoAuto() {
        return valorMesPagoPrestamoAuto;
    }

    @Override
    public String toString() {
        String c = "******************\n"
                + "PRESTAMO AUTOMOVIL\n"
                + "******************\n";
        c = String.format("%s\n%s\n"
                + "Tipo de automovil: %s\n"
                + "Marca de automovil: %s\n"
                + "Garante: %s\n"
                + "Valor de automovil: %.2f\n"
                + "Valor mensual de pago del prestamo: %.2f\n"
                ,c
                , super.toString()
                ,obtenerTipoAuto()
                ,obtenerMarcaAuto()
                ,obtenerGarante1()
                ,obtenerValorAuto()
                ,obtenerValorMesPagoPrestamoAuto()
        );
        return c;
    }
}    

