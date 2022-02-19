/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laboratorio5;

import javax.swing.JOptionPane;

/**
 *
 * @author jcgof
 */
public class Persona {

    private String nombre;
    private String poder;
    private String debilidad;
    private boolean escuadron;
    private int fuerza;
    private int agilidadfisica;
    private int agilidadmental;
    private boolean heroe;

    public Persona(String nombre, String poder, String debilidad, boolean escuadron, int fuerza, int agilidadfisica, int agilidadmental,
             boolean heroe) {
        int total = fuerza + agilidadfisica + agilidadmental;
        this.nombre = nombre;
        this.poder = poder;
        this.debilidad = debilidad;
        this.escuadron = escuadron;
        if (total >= 100) {
            this.fuerza = fuerza;
            this.agilidadfisica = agilidadfisica;
            this.agilidadmental = agilidadmental;
        } else {
            JOptionPane.showMessageDialog(null, "Total del villano/heroe creado es inferior a 100");
        }
        this.heroe = heroe;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getDebilidad() {
        return debilidad;
    }

    public void setDebilidad(String debilidad) {
        this.debilidad = debilidad;
    }

    public boolean getEscuadron() {
        return escuadron;
    }

    public void setEscuadron(boolean escuadron) {
        this.escuadron = escuadron;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getAgilidadfisica() {
        return agilidadfisica;
    }

    public void setAgilidadfisica(int agilidadfisica) {
        this.agilidadfisica = agilidadfisica;
    }

    public int getAgilidadmental() {
        return agilidadmental;
    }

    public void setAgilidadmental(int agilidadmental) {
        this.agilidadmental = agilidadmental;
    }

    public boolean isHeroe() {
        return heroe;
    }

    public void setHeroe(boolean heroe) {
        this.heroe = heroe;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", poder=" + poder + ", debilidad=" + debilidad + ", escuadron=" + escuadron + ", fuerza=" + fuerza + ", agilidadfisica=" + agilidadfisica + ", agilidadmental=" + agilidadmental + ", heroe=" + heroe + '}';
    }

    public void final_chance(Persona p1, Persona p2) {
        
    }

}
