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
public class SuperHumano extends Persona {

    private String superpoder;

    public SuperHumano(String superpoder, String nombre, String poder, String debilidad, boolean escuadron, int fuerza, int agilidadfisica, int agilidadmental, boolean heroe) {
        super(nombre, poder, debilidad, escuadron, fuerza, agilidadfisica, agilidadmental, heroe);
        this.superpoder = superpoder;
    }

    public SuperHumano(String superpoder) {
        this.superpoder = superpoder;
    }

    public String getSuperpoder() {
        return superpoder;
    }

    public void setSuperpoder(String superpoder) {
        this.superpoder = superpoder;
    }

    @Override
    public String toString() {
        return "SuperHumano{" + "superpoder=" + superpoder + '}';
    }

    public void final_chance(Persona p1, Persona p2) {
        int fuerza = p1.getFuerza();
        int total = fuerza * 4;
        p1.setFuerza(total);
        System.out.println("Fuerza aumentada: " + p1.getFuerza());
        int FuerzaA = p2.getFuerza();
        int totalA = FuerzaA- (int) Math.ceil(FuerzaA * 0.5);
        p2.setFuerza(totalA);
        System.out.println("Fuerza debilitada del lider: " +p2.getFuerza());
    }

}
