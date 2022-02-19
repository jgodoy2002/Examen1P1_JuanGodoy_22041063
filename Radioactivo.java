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
public class Radioactivo extends Persona {

    private int edad;
    private String tipo;

    public Radioactivo(int edad, String tipo, String nombre, String poder, String debilidad, boolean escuadron, int fuerza, int agilidadfisica, int agilidadmental, boolean heroe) {
        super(nombre, poder, debilidad, escuadron, fuerza, agilidadfisica, agilidadmental, heroe);
        this.edad = edad;
        this.tipo = tipo;
    }

    public Radioactivo(int edad, String tipo) {
        this.edad = edad;
        this.tipo = tipo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Radioactivo{" + "edad al momento del accidente=" + edad + ", "
                + "tipo de accidente=" + tipo + '}';
    }

    
    public void final_chance(Persona p1, Persona p2){
        int fuerza = p1.getFuerza();
        int total = fuerza * 4;
        p1.setFuerza(total);
        System.out.println("Fuerza aumentada: " +p1.getFuerza());
    }
    
    
}
