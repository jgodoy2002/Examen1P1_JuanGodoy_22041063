/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laboratorio5;

import java.util.Random;

/**
 *
 * @author jcgof
 */
public class Alien extends Extraterrestre {

    private String planeta;

    public Alien(String planeta, String nombre, String poder, String debilidad, boolean escuadron, int fuerza, int agilidadfisica, int agilidadmental, boolean heroe) {
        super(nombre, poder, debilidad, escuadron, fuerza, agilidadfisica, agilidadmental, heroe);
        this.planeta = planeta;
    }

    public String getPlaneta() {
        return planeta;
    }

    public void setPlaneta(String planeta) {
        this.planeta = planeta;
    }

    @Override
    public String toString() {
        return "Alien{" + super.toString() + "planeta=" + planeta + '}';
    }

    public void final_chance(Persona p1, Persona p2) {
        Random random = new Random();
        int randomN1 = random.nextInt((3 - 1) + 1) + 1;
        int randomN2 = random.nextInt((2 - 1) + 1) + 1;
        int fuerza = p1.getFuerza();
        int total = fuerza * 4;
        p1.setFuerza(total);
        System.out.println("Fuerza aumentada: " + p1.getFuerza());
        switch (randomN1) {
            case 1:
                int habilidadA = p2.getAgilidadfisica();
                int totalA = habilidadA - (int) Math.ceil(habilidadA * 0.5);
                p2.setAgilidadfisica(totalA);
                if (randomN2 == 1) {
                    int habilidadM = p2.getAgilidadmental();
                    int totalM = habilidadM - (int) Math.ceil(habilidadM * 0.5);
                    p2.setAgilidadmental(totalM);

                } else {
                    int fuerzaA = p2.getFuerza();
                    int totalF = fuerzaA - (int) Math.ceil(fuerzaA * 0.5);
                    p2.setFuerza(totalF);
                }
                break;
            case 2:
                int habilidadM2 = p2.getAgilidadmental();
                int totalM2 = habilidadM2 - (int) Math.ceil(habilidadM2 * 0.5);
                p2.setAgilidadmental(totalM2);

                if (randomN2 == 1) {
                    int habilidadA2 = p2.getAgilidadfisica();
                    int totalA2 = habilidadA2 - (int) Math.ceil(habilidadA2 * 0.5);
                    p2.setAgilidadfisica(totalA2);

                } else {
                    int fuerzaA2 = p2.getFuerza();
                    int totalF2 = fuerzaA2 - (int) Math.ceil(fuerzaA2 * 0.5);
                    p2.setFuerza(totalF2);
                }
                break;
            case 3:
                int fuerzaA3 = p2.getFuerza();
                int totalF3 = fuerzaA3 - (int) Math.ceil(fuerzaA3 * 0.5);
                p2.setFuerza(totalF3);
                ;

                if (randomN2 == 2) {
                    int habilidadA3 = p2.getAgilidadfisica();
                    int totalA2 = habilidadA3 - (int) Math.ceil(habilidadA3 * 0.5);
                    p2.setAgilidadfisica(totalA2);

                } else {
                    int habilidadM3 = p2.getAgilidadmental();
                    int totalM3 = habilidadM3 - (int) Math.ceil(habilidadM3 * 0.5);
                    p2.setAgilidadmental(totalM3);
                }

                break;

        }

    }

}
