/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author LENOVO
 */
public class Persona {
    private String name;
    private String surName;
    private String nickName;

    public Persona(String n, String sn, String nn){
        name = n;
        surName = sn;
        nickName = nn;
    }
    
    public void establecerName(String n) {
        name = n;
    }
    public void establecerSurName(String s) {
        surName = s;
    }
    public void establecerNickName(String nN) {
        nickName = nN;
    }

    public String obtenerName() {
        return name;
    }
    public String obtenerSurName() {
        return surName;
    }
    public String obtenerNickName() {
        return nickName;
    }

    @Override
    public String toString() {
        String c = String.format("Nombre: %s\n"
                + "Apellido: %s\n"
                + "User name: %s\n"
                ,obtenerName()
                ,obtenerSurName()
                ,obtenerNickName()
        );
        return c;
    }
}
