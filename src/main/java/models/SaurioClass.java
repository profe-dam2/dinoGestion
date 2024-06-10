/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author mañana
 */
public class SaurioClass {
    private String nombreSaurio;
    private String poder;
    private int dinoAge;
    private String alimentacione;

    public SaurioClass() {
    }

    public SaurioClass(String nombreSaurio, String poder, int dinoAge, String alimentacion) {
        this.nombreSaurio = nombreSaurio;
        this.poder = poder;
        this.dinoAge = dinoAge;
        this.alimentacione = alimentacion;
    }

    public String getNombreSaurio() {
        return nombreSaurio;
    }

    public void setNombreSaurio(String nombreSaurio) {
        this.nombreSaurio = nombreSaurio;
    }


    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public int getDinoAge() {
        return dinoAge;
    }

    public void setDinoAge(int dinoAge) {
        this.dinoAge = dinoAge;
    }

    public String getAlimentacion() {
        return alimentacione;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacione = alimentacion;
    }
    
    
}
