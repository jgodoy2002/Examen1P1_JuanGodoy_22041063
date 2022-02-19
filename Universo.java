/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laboratorio5;

import java.util.ArrayList;

/**
 *
 * @author jcgof
 */
public class Universo {

    String nombre;
    ArrayList<Escuadron> escuadron;

    public Universo(String nombre, ArrayList<Escuadron> escuadron) {
        this.nombre = nombre;
        this.escuadron = escuadron;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Escuadron> getEscuadron() {
        return escuadron;
    }

    public void setEscuadron(ArrayList<Escuadron> escuadron) {
        this.escuadron = escuadron;
    }

}
