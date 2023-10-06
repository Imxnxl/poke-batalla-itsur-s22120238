/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model;

/**
 *
 * @author FJML1983
 */
public class Charizard extends Pokemon {

    public Charizard() {
        tipo = "FUEGO/VOLADOR";
        hp = 78;
        ataque = 84;
        defensa = 78;
        nivel = 1;
        precision = 4;
    }

    //Constructor alterno 1
    public Charizard(String nombre){
        this(); //invocando al constructor default
        this.nombre = nombre;
    }
    
}

