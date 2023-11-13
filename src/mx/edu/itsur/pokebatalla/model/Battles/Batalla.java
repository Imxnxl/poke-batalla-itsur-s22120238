package mx.edu.itsur.pokebatalla.model.Battles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;
import mx.edu.itsur.pokebatalla.model.Pokemons.Pokemon;

/**
 *
 * @author Josue Imanol Saavedra Mandujano
 */
public class Batalla {

    protected Entrenador entrenador1;
    protected Entrenador entrenador2;
    protected int turno = 1;
    protected boolean batallaFinalizada = false;

    private boolean primerAtaqueRealizado = false;

    public Batalla(Entrenador entrenador1, Entrenador entrenador2) {
        this.entrenador1 = entrenador1;
        this.entrenador2 = entrenador2;
    }

    public void desarrollarBatalla() {
        System.out.println(" La Batalla Comienza");
        System.out.println("Pokemons:");
        System.out.println(entrenador1.getNombre() + " Contra " + entrenador2.getNombre());

        System.out.println(" ");

        eligirPokemon(entrenador1);
        eligirPokemon(entrenador2);

        while (!batallaFinalizada) {
            Entrenador entrenadorEnTurno = (turno == 1) ? entrenador1 : entrenador2;
            Entrenador oponente = (turno == 1) ? entrenador2 : entrenador1;

            System.out.println("Turno de:" + entrenadorEnTurno.getNombre());

           
            if (entrenadorEnTurno.getPokemonActual() == null || entrenadorEnTurno.getPokemonActual().gethp() <= 0) {
                cambiarPokemon(entrenadorEnTurno);
            }
           
            if (oponente.getPokemonActual() == null) {
                System.out.println("El oponente no ha a seleccionado un pokemon");
                return;
            }

  
            seleccionarAtaque(entrenadorEnTurno, oponente.getPokemonActual());

            Pokemon pokemonEnTurno = entrenadorEnTurno.getPokemonActual();

            if (oponente.estaDerrotado()) {
                System.out.println(oponente.getNombre() + "Pierde");
                batallaFinalizada = true;
            } else {
              
                turno = (turno == 1) ? 2 : 1;
            }
        }
    }

    private void eligirPokemon(Entrenador EnTn) {
        int idx = 1;
        System.out.println("");
        for (Pokemon pokemon : EnTn.getPokemonsCapturados()) {
            System.out.println(idx + ".- " + pokemon.getClass().getSimpleName());
            idx++;
             System.out.println("");
        }
        System.out.println("");
        System.out.println("Elige un  pokemon " + EnTn.getNombre());

        char auxLectura = '0';

        try {
            auxLectura = (char) System.in.read();
            System.in.read((new byte[System.in.available()]));
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        Pokemon pokemonSeleccionado = EnTn.getPokemonsCapturados()
                .get(Character.getNumericValue(auxLectura) - 1);
        EnTn.setPokemonActual(pokemonSeleccionado);
    }

   
    private void seleccionarAtaque(Entrenador entrenadorEnturno, Pokemon oponente) {

        Pokemon pokemonActual = entrenadorEnturno.getPokemonActual();

        System.out.println("");
        System.out.println("Seleccione un ataque de" + pokemonActual.getClass().getSimpleName() + ":");

        int idx = 1;

        for (Enum movimiento : pokemonActual.getMovimientos()) {
            System.out.println(idx + ".- " + movimiento);
            idx++;
        }
        System.out.println("");

        int opcionAtaque = -1;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            opcionAtaque = Integer.parseInt(br.readLine());
        } catch (IOException | NumberFormatException ex) {
            System.out.println("Ingresa algun numero valido");
            return;
        }

        if (opcionAtaque < 1 || opcionAtaque > pokemonActual.getMovimientos().length) {
            System.out.println("La opción no es valida.");
            return;
        }

       
        entrenadorEnturno.instruirMovimientoAlPokemonActual(oponente, opcionAtaque - 1);
    }

private void cambiarPokemon(Entrenador entrenador) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("¿Quieres cambiar de Pokémon? (S/N)");

    char respuesta = scanner.next().charAt(0);

    if (respuesta == 'S' || respuesta == 's') {
        System.out.println("Pokémon disponibles:");

        for (int i = 0; i < entrenador.getPokemonsCapturados().size(); i++) {
            Pokemon pokemon = entrenador.getPokemonsCapturados().get(i);
            System.out.println((i + 1) + ".- " + pokemon.getClass().getSimpleName());
        }

        System.out.println("Elige un Pokémon:");

        int indiceElegido = -1;

        try {
            indiceElegido = scanner.nextInt() - 1;
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. No se ha cambiado de Pokémon.");
            return;
        }

        if (indiceElegido >= 0 && indiceElegido < entrenador.getPokemonsCapturados().size()) {
            Pokemon nuevoPokemon = entrenador.getPokemonsCapturados().get(indiceElegido);
            entrenador.setPokemonActual(nuevoPokemon);

            System.out.println("Has elegido a " + nuevoPokemon.getClass().getSimpleName() + " en tu equipo.");
        } else {
            System.out.println("Selección inválida. No se ha cambiado de Pokémon.");
        }
    }
}
}

