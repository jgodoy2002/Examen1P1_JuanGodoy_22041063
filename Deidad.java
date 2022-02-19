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
public class Deidad extends Extraterrestre {

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

    public void final_chance(Persona p1, Persona p2) {
        int fuerza = p1.getFuerza();
        int total = fuerza * 4;
        p1.setFuerza(total);
        System.out.println("Fuerza aumentada: " + p1.getFuerza());
        int habilidadA = p2.getAgilidadfisica();
        int totalA = habilidadA - (int) Math.ceil(habilidadA * 0.5);
        p2.setAgilidadfisica(totalA);
        int habilidadM = p2.getAgilidadmental();
        int totalM = habilidadM - (int) Math.ceil(habilidadM * 0.5);
        p2.setAgilidadmental(totalM);
        int fuerzaA = p2.getFuerza();
        int totalF = fuerzaA -(int)Math.ceil(fuerzaA *0.5);
        p2.setFuerza(totalF);
        System.out.println("Fuerza / Fisica / Mental :" +p2.getFuerza() + "/"
                            + p2.getAgilidadfisica() + "/" + p2.getAgilidadmental());
        
    }

}
