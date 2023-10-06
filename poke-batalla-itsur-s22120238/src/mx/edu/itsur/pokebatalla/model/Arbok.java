/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model;

/**
 *
 * @author FJML1983
 */
public class Arbok extends Pokemon {

    public Arbok() {
        tipo = "VENENO";
        hp = 60;
        ataque = 85;
        defensa = 69;
        nivel = 1;
        precision = 4;
    }

    //Constructor alterno 1
    public Arbok(String nombre){
        this(); //invocando al constructor default
        this.nombre = nombre;
    }
    
}
