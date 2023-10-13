package mx.edu.itsur.pokebatalla.model;

import java.util.ArrayList;

//@Author Imxnxl
public class Meowth extends Pokemon {

    public Meowth() {
        this.tipo = "NORMAL";
        this hp = 40;
        this.ataque = 45;
        this.defensa = 35;
        this.nivel = 1;
        this.precision = 6;
        this.habilidades = new ArrayList<>();
        this.habilidades.add("ARAÑAZO");
        this.habilidades.add("MORDISCO");
        this.habilidades.add("CANTO");
    }

    public Meowth(String nombre) {
        this();
        this.nombre = nombre;
    }

    public void atacar(Pokemon oponente, String habilidad) {
        if (habilidad.equals("ARAÑAZO")) {
            System.out.println("Realizando Arañazo");
        } else if (habilidad.equals("MORDISCO")) {
            System.out.println("Realizando Mordisco");
        } else if (habilidad.equals("CANTO")) {
            System.out.println("Realizando Canto");
        }
    }
}
