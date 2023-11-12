package mx.edu.itsur.pokebatalla.model.Pokemons;

import mx.edu.itsur.pokebatalla.model.Battles.Batalla;
import mx.edu.itsur.pokebatalla.model.Battles.Entrenador;

/**
 *
 * @author imanol
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Meowth a = new Meowth ("Meowth");
        Arbok b = new Arbok("Arbok");
        Charizard c = new Charizard ("Charizard");
       

        Entrenador en1 = new Entrenador("Josh");
        en1.capturarPokemon(a);
        en1.capturarPokemon(b);

        Entrenador en2 = new Entrenador("Frank");
        en2.capturarPokemon(b);
        en2.capturarPokemon(c);

        Batalla x = new Batalla(en1, en2);
        x.desarrollarBatalla();
        
   
        
    }
    
}
