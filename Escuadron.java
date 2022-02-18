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
public class Escuadron {

    private String nombre;
    private String lugarbase;
    private Persona lider;
    private boolean heroe;
    private ArrayList<Persona> miembros;

    public Escuadron() {
    }

    public Escuadron(String nombre, String lugarbase, Persona lider, boolean heroe, ArrayList<Persona> miembros) {
        this.nombre = nombre;
        this.lugarbase = lugarbase;
        this.lider = lider;
        this.heroe = heroe;
        this.miembros = miembros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugarbase() {
        return lugarbase;
    }

    public void setLugarbase(String lugarbase) {
        this.lugarbase = lugarbase;
    }

    public Persona getLider() {
        return lider;
    }

    public void setLider(Persona lider) {
        this.lider = lider;
    }

    public boolean isHeroe() {
        return heroe;
    }

    public void setHeroe(boolean heroe) {
        this.heroe = heroe;
    }

    public ArrayList<Persona> getMiembros() {
        return miembros;
    }

    public void setMiembros(ArrayList<Persona> miembros) {
        this.miembros = miembros;
    }

}
