/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laboratorio5;

/**
 *
 * @author jcgof
 */
public class Deidad extends Extraterrestre{
    private boolean creyentes;
    private String mitologio;

    public Deidad(boolean creyentes, String mitologio, String nombre, String poder, String debilidad, boolean escuadron, int fuerza, int agilidadfisica, int agilidadmental, boolean heroe) {
        super(nombre, poder, debilidad, escuadron, fuerza, agilidadfisica, agilidadmental, heroe);
        this.creyentes = creyentes;
        this.mitologio = mitologio;
    }

    

    public boolean isCreyentes() {
        return creyentes;
    }

    public void setCreyentes(boolean creyentes) {
        this.creyentes = creyentes;
    }

    public String getMitologio() {
        return mitologio;
    }

    public void setMitologio(String mitologio) {
        this.mitologio = mitologio;
    }

    @Override
    public String toString() {
        return "Deidad{" + super.toString() + "creyentes=" + creyentes + ", mitologio=" + mitologio + '}';
    }
    
    
}
