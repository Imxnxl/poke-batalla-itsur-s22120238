package mx.edu.itsur.pokebatalla.model.Pokemons;
import mx.edu.itsur.pokebatalla.model.Moves.EMBER;
import mx.edu.itsur.pokebatalla.model.Moves.DRAGONRAGE;
import mx.edu.itsur.pokebatalla.model.Moves.WINGATTACK;
import mx.edu.itsur.pokebatalla.model.Moves.Movimiento;
/**
 *
 * @Author Josue Imanol Saavedra Mandujano
 */

public  class Charizard extends Pokemon {    

    public EMBER instanciaMovimiento;
     public  enum Movimientos{
         EMBER,
         DRAGONRAGE,
         WINGATTACK,
         
    }
 public Charizard() {
        tipo = "FUEGO";
        hp = 80;
        ataque = 100;
        defensa = 70;
        nivel = 1;
        precision = 3;
    }
    
    public Charizard (String nombre){
        this(); 
        this.nombre = nombre;
    }
@Override
    public Enum[] getMovimientos() {
        return Charizard.Movimientos.values();
    }

    @Override
    public void atacar(Pokemon oponente, int ordinalMovimiento) {

        if (this.hp <= 0) {
            System.out.println("Charizard no puede seguir.");
            return;
        }
        Charizard.Movimientos movimientoAUtilizar = Charizard.Movimientos.values()[ordinalMovimiento];
        Movimiento instanciaMovimiento;
        switch (movimientoAUtilizar){
            case EMBER:            
            instanciaMovimiento = new EMBER ();
                break;
            case DRAGONRAGE:            
            instanciaMovimiento = new DRAGONRAGE();
                break;
            case WINGATTACK:
             instanciaMovimiento = new WINGATTACK();
                  break;

             default:
               throw new AssertionError();
        }
    }
    
}
