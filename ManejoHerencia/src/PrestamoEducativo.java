/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import paquete2.InstitucionEducativa;
import paquete2.Persona;
import paquete2.Prestamo;
/**
 *
 * @author reroes
 */
public class PrestamoEducativo extends Persona{
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
