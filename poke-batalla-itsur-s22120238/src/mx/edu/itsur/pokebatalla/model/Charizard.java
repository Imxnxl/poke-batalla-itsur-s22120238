package mx.edu.itsur.pokebatalla.model;

import java.util.ArrayList;

//@Author Imxnxl
public class Charizard extends Pokemon {

    public Charizard() {
        this.tipo = "FUEGO";
        this.hp = 78;
        this.ataque = 84;
        this.defensa = 78;
        this.nivel = 1;
        this.precision = 8;
        this.habilidades = new ArrayList<>();
        this.habilidades.add("LANZALLAMAS");
        this.habilidades.add("GARRADEDRAGON");
        this.habilidades.add("TORMENTO");
    }

    public Charizard(String nombre) {
        this();
        this.nombre = nombre;
    }

    public void atacar(Pokemon oponente, String habilidad) {
        if (habilidad.equals("LANZALLAMAS")) {
            System.out.println("Realizando Lanzallamas");
        } else if (habilidad.equals("GARRADEDRAGON")) {
            System.out.println("Realizando Garra de Dragón");
        } else if (habilidad.equals("TORMENTO")) {
            System.out.println("Realizando Tormento");
        }
    }
}
