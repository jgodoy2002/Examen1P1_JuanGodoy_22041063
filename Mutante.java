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
public class Mutante extends Persona{
    
    private String mutacion;

    public Mutante(String mutacion, String nombre, String poder, String debilidad, boolean escuadron, int fuerza, int agilidadfisica, int agilidadmental, boolean heroe) {
        super(nombre, poder, debilidad, escuadron, fuerza, agilidadfisica, agilidadmental,heroe);
        this.mutacion = mutacion;
    }

    public String getMutacion() {
        return mutacion;
    }

    public void setMutacion(String mutacion) {
        this.mutacion = mutacion;
    }

    @Override
    public String toString() {
        return super.toString() + "Mutante :" + "mutacion=" + mutacion + '}';
    }
    
    public void final_chance(Persona p1, Persona p2){
        int fuerza = p1.getFuerza();
        int total = fuerza*2;
        p1.setFuerza(total);
        System.out.println("Fuerza actualizada: " + p1.getFuerza());
        int fuerzaL = p2.getFuerza();
        int verdadera = fuerzaL / 2;
        p2.setFuerza(verdadera);
        System.out.println("Fuerza del lider actualizada: " + p2.getFuerza());
    }
    
    
}
