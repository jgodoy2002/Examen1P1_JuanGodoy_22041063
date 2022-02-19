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
public class BDD {

    ArrayList<Persona> persona = new ArrayList();
    ArrayList<Escuadron> squad = new ArrayList();
    ArrayList<Universo> universe = new ArrayList();

    public void crearU(String nombre, ArrayList<Escuadron> squad) {
        if(UniversoVerificacion(nombre)==true)
            universe.add(new Universo(nombre,squad));
        System.out.println("Ese nombre ya existe");   
    }

    public void modificarU(int opcion,String nombre, ArrayList<Escuadron> squa){
        switch(opcion){
            case 1:
                break;
            case 2:
                break;
                
        }
    }
    
    public boolean UniversoVerificacion(String nombre) {
        for (int i = 0; i < universe.size(); i++) {
            if (universe.get(i).getNombre() != nombre) {
                return true;
            }
        }
        return false;
    }

    public boolean nombrePersona(String nombre) {
        for (int i = 0; i < persona.size(); i++) {
            if (persona.get(i).getNombre() != nombre) {
                return true;
            }
        }
        return false;
    }

    public boolean nombreSquadDoubleU(String nombre){
        for (int i = 0; i < squad.size(); i++) {
            if(squad.get(i).getNombre()!=nombre){
                return true;
            }
        }
        return false;
    }
}
