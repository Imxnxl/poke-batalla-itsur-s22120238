/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model;

/**
 *
 * @author FJML1983
 */
public class Meowth extends Pokemon {

    public Meowth() {
        tipo = "NORMAL";
        hp = 40;
        ataque = 45;
        defensa = 35;
        nivel = 1;
        precision = 4;
    }

    //Constructor alterno 1
    public Meowth(String nombre){
        this(); //invocando al constructor default
        this.nombre = nombre;
    }
    
}
