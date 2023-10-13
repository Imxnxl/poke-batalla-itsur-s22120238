package mx.edu.itsur.pokebatalla.model;

import java.util.ArrayList;

//@Author Imxnxl
public class Arbok extends Pokemon {

    public Arbok() {
        this.tipo = "VENENO";
        this.hp = 60;
        this.ataque = 85;
        this.defensa = 69;
        this.nivel = 1;
        this.precision = 7;
        this.habilidades = new ArrayList<>();
        this.habilidades.add("MORDISCO");
        this.habilidades.add("COIL");
        this.habilidades.add("POISONGAS");
    }

    public Arbok(String nombre) {
        this();
        this.nombre = nombre;
    }

    public void atacar(Pokemon oponente, String habilidad) {
        if (habilidad.equals("MORDISCO")) {
            System.out.println("Realizando Mordisco");
        } else if (habilidad.equals("COIL")) {
            System.out.println("Realizando Coil");
        } else if (habilidad.equals("POISONGAS")) {
            System.out.println("Realizando Poison Gas");
        }
    }
}
