package mx.edu.itsur.pokebatalla.model.Pokemons;
import mx.edu.itsur.pokebatalla.model.Moves.Movimiento;
import mx.edu.itsur.pokebatalla.model.Moves.POISINGSTING;
import mx.edu.itsur.pokebatalla.model.Moves.GLARE;
import mx.edu.itsur.pokebatalla.model.moves.ACID;
        /*
        /**
        *
        * @author Josue Imanol Saavedra Mandujano
        */
public class Arbok extends Pokemon {

    
    
    public  enum Movimientos{
        POISINGSTING,
        GLARE,
        ACID,

    }
 public Arbok() {
        tipo = "PSIQUICO";
        hp = 106;
        ataque = 110;
        defensa = 90;
        nivel = 1;
        precision = 5;
    }
    //Constructor alterno 1
    public Arbok (String nombre){
        this(); //constructor default
        this.nombre = nombre;
    }
    @Override
    public Enum[] getMovimientos() {
        return Arbok.Movimientos.values();
    }

    @Override
    public void atacar(Pokemon oponente, int ordinalMovimiento) {

        if (this.hp <= 0) {
            System.out.println("Mewtwo esta muriendo y no puede atacar mas.");
            return;
        }
        Arbok.Movimientos movimientoAUtilizar = Arbok.Movimientos.values()[ordinalMovimiento];
        Movimiento instanciaMovimiento;
        switch (movimientoAUtilizar){
            
            case PSICORRAYO: 
                instanciaMovimiento = new POISINGSTING();
                break;
                
            case TELETRANSPORTE:
                instanciaMovimiento = new GLARE();
                break;
                case CAMPOPSIQUICO:
                instanciaMovimiento = new CampoPsiquico();
                break;    
                
            
                                      /**
                                      case Psicorrayo:
                                        instanciaMovimiento = new Psicorrayo();
                                           break;
                                        case Teletransporte:
                                        instanciaMovimiento = new Teletransporte ();
                                          break;
                                          * case CampoPsiquico:
                                        instanciaMovimiento = new CampoPsiquico ();
                                          break;
                                      */ 
             default:
               throw new AssertionError();
        }
        instanciaMovimiento.utilizar(this, oponente);
    }
    
}
