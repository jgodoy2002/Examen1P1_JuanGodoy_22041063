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
public class Normal extends Persona {

    public Normal(String nombre, String poder, String debilidad, boolean escuadron, int fuerza, int agilidadfisica, int agilidadmental, boolean heroe) {
        super(nombre, poder, debilidad, escuadron, fuerza, agilidadfisica, agilidadmental,heroe);
    }

    @Override
    public String toString() {
        return "Normal{" + super.toString() + '}';
    }

    public void final_chance(Persona p1, Persona p2){
        int fuerza = p1.getFuerza();
        int total = fuerza + (int)Math.ceil(fuerza*0.5);
        p1.setFuerza(total);
        System.out.println("La fuerza se aumento a: " +p1.getFuerza());
    }
    
}
