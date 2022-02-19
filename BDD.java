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
        if (UniversoVerificacion(nombre) == true) {
            universe.add(new Universo(nombre, squad));
        }
        System.out.println("Ese nombre ya existe");
    }

    public void modificarU(int id, String nombre, ArrayList<Escuadron> squa) {
        for (int i = 0; i < universe.size(); i++) {
            if (universe.get(i) == universe.get(id)) {
                universe.get(id).setNombre(nombre);
                universe.get(id).setEscuadron(squa);
            } else {
                System.out.println("El indice ingresado no es el correcto solo hay "
                        + universe.size() + " universos");
            }
        }
    }

    public void eliminarU(int id) {
        for (int i = 0; i < universe.size(); i++) {
            if (universe.get(i) == universe.get(id)) {
                universe.remove(id);
            } else {
                System.out.println("El indice ingresado no es el correcto solo hay "
                        + universe.size() + " universos");
            }
        }
    }

    public void listarU() {
        for (Universo uni : universe) {
            System.out.println("Todos los universos son: ");
            System.out.println("Nombre " + uni.getNombre()
                    + "Escuadron" + uni.getEscuadron());
        }
    }

    public void crearS(String nombre, String lugar, Persona lider, boolean heroe, ArrayList<Persona> miembros) {
        if (nombreSquadDoubleU(nombre) == true) {
            squad.add(new Escuadron(nombre, lugar, lider, heroe, miembros));
        }
        System.out.println("Ese nombre lamentablemente ya existe");
    }

    public void modificarS() {

    }

    public void eliminarS() {

    }

    public void listarS(){
        
    }
    
    public void AgregarPersonaAlSquad(){
        
    }
    
    public void simulacion(){
        
    }
    
    public void crearP(){
        
    }
    
    public void modificarP(){
        
    }
    
    public void eliminarP(){
        
    }
    
    public void listarP(){
        
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

    public boolean nombreSquadDoubleU(String nombre) {
        for (int i = 0; i < squad.size(); i++) {
            if (squad.get(i).getNombre() != nombre) {
                return true;
            }
        }
        return false;
    }
}
