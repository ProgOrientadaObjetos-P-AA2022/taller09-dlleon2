/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete4;

import paquete2.InstitucionEducativa;
import paquete2.Persona;
import paquete2.Prestamo;
/**
 *
 * @author LENOVO
 */
public class PrestamoEducativo {
    private String nivelEstudio;
    private InstitucionEducativa centroEducativo;
    private double valorCarrera;
    private double valorMesCarrera;
   
    public PrestamoEducativo(String nE, InstitucionEducativa cE, double vC, 
            Persona b, int t, String c){
        super(b,t,c);
        nivelEstudio = nE;
        centroEducativo = cE;
        valorCarrera = vC;
}

    public void establecerNivelEstudio(String nE) {
        nivelEstudio = nE;
    }
    public void establecerCentroEducativo(InstitucionEducativa cE) {
        centroEducativo = cE;
    }
    public void establecerValorCarrera(double vC) {
        valorCarrera = vC;
    }
    public void establecerValorMesCarrera() {
        valorMesCarrera = (valorCarrera / tiempoPrestamo) - 
                ((valorCarrera / tiempoPrestamo) * 0.1);
    }

    public String obtenerNivelEstudio() {
        return nivelEstudio;
    }
    public InstitucionEducativa obtenerCentroEducativo() {
        return centroEducativo;
    }
    public double obtenerValorCarrera() {
        return valorCarrera;
    }
    public double obtenerValorMesCarrera() {
        return valorMesCarrera;
    }

    @Override
    public String toString() {
        String c = "******************\n"
                + "PRESTAMO EDUCATIVO\n"
                + "******************\n";
        c = String.format("%s\n%s\n"
                + "Nivel de estudio: %s\n"
                + "Centro educativo: %s\n"
                + "Valor de la carrera: %.2f\n"
                + "Valor mensual de pago del prestamo: %.2f\n"
                ,c
                ,super.toString()
                ,obtenerNivelEstudio()
                ,obtenerCentroEducativo()
                ,obtenerValorCarrera()
                ,obtenerValorMesCarrera()
        );
        return c;
    }
}
