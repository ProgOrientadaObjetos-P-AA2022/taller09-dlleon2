/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.Locale;
import java.util.Scanner;
import paquete2.InstitucionEducativa;
import paquete2.Persona;
import paquete2.Prestamo;
import paquete5.PrestamoEducativo;

/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        boolean pregunta = true;
        
        String cad = "";
        
        int op;

        do {
            System.out.println("ELIJA LA OPCION DEL PRESTAMO\n"
                    + "Prestamo Automovil          [1]\n"
                    + "Prestamo Educativo          [2]\n"
                    + "Salir del programa          [0]");
            op = sc.nextInt();
            sc.nextLine();

            if (op == 1 || op == 2) {

                System.out.println("\nIngrese el Nombre del Beneficiario");
                String name = sc.nextLine();
                System.out.println("Ingrese el Apellido del Beneficiario");
                String surname = sc.nextLine();
                System.out.println("Ingrese el Username del Beneficiario");
                String username = sc.nextLine();

                System.out.println("Ingrese el nombre de la ciudad");
                String ciudad = sc.nextLine();
                System.out.println("Ingrese la cantidad de meses a pagar el "
                        + "préstamo");
                int meses = sc.nextInt();
                sc.nextLine();

                Persona p1 = new Persona(name, surname, username);
                Prestamo pres = new Prestamo(p1, meses, ciudad);

                if (op == 1) {
                    
                    System.out.println("Ingrese el tipo de Automovil: ");
                    String tipo = sc.nextLine();
                    System.out.println("Ingrese la marca del Automovil");
                    String marca = sc.nextLine();
                    System.out.println("Ingrese el Nombre del garante:");
                    String nomGarant = sc.nextLine();
                    System.out.println("Ingrese Apellido del garante:");
                    String apeGarant = sc.nextLine();
                    System.out.println("Ingrese Username del garante:");
                    String userGarant = sc.nextLine();
                    System.out.println("Ingrese el valor del Automovil");
                    double valorAuto = sc.nextDouble();
                    sc.nextLine();
                    
                    Persona p2 = new Persona(nomGarant, apeGarant, userGarant);
                    PrestamoAutomovil pAuto = new PrestamoAutomovil(tipo, marca, 
                            p2, valorAuto, p1, meses,ciudad);
                    pAuto.establecerValorMesPagoPrestamoAuto();
                    
                    cad = String.format("%s\n%s\n"
                            ,cad,pAuto); 
                    
                }else if (op == 2) {
                    
                    System.out.println("Ingrese el nivel de estudio: ");
                    String nivel = sc.nextLine();
                    System.out.println("Ingrese el nombre de la "
                            + "institución educativa: ");
                    String nombre = sc.nextLine();
                    System.out.println("Ingrese las siglas de la "
                            + "institución educativa: ");
                    String siglas = sc.nextLine();
                    System.out.println("Ingrese el valor de la carrera: ");
                    double valorEduc = sc.nextDouble();
                    
                    InstitucionEducativa i = new InstitucionEducativa(nombre,
                            siglas);
                    PrestamoEducativo pEduc = new PrestamoEducativo(nivel, i 
                            ,valorEduc,p1, meses,ciudad);
                    
                    cad = String.format("%s\n%s\n"
                            ,cad
                            ,pEduc
                    );
                }
            } else if (op == 0) {
                pregunta = false;
            } else
                System.out.println("Ingrese una opcion valida..\n");
        } while (pregunta);
        System.out.println(cad);
    }
}
