/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itsur.pokebatalla.model.Pokemons;

import mx.edu.itsur.pokebatalla.model.Moves.Movimiento;
import mx.edu.itsur.pokebatalla.model.Moves.SCRATCH;
import mx.edu.itsur.pokebatalla.model.Moves.PAYDAY;
import mx.edu.itsur.pokebatalla.model.Moves.BITE;
/**
 *
 * @author IMANOL
 */
public  class Meowth extends Pokemon {
     public  enum Movimientos{
         SCRATCH,
         PAYDAY,
         BITE,
    }
 public Meowth() {
        tipo = "NORMAL";
        hp = 44;
        ataque = 48;
        defensa = 65;
        nivel = 1;
        precision = 4;
    }
    //Constructor alterno 1
    public Meowth (String nombre){
        this(); //constructor default
        this.nombre = nombre;
    }
     @Override
    public Enum[] getMovimientos() {
        return Meowth.Movimientos.values();
    }

    @Override
    public void atacar(Pokemon oponente, int ordinalMovimiento) {

        if (this.hp <= 0) {
            System.out.println("Squirtle. esta muriendo y no puede atacar mas.");
            return;
        }
        Meowth.Movimientos movimientoAUtilizar = Meowth.Movimientos.values()[ordinalMovimiento];
        Movimiento instanciaMovimiento;
        switch (movimientoAUtilizar){
            
            case Cascada: 
                instanciaMovimiento = new SCRATCH();
                break;
                case Refugio: 
                instanciaMovimiento = new PAYDAY();
                break;
                case PulsoDragon: 
                instanciaMovimiento = new BITE();
                break;
                /**
            case Psicorrayo:
                instanciaMovimiento = new Psicorrayo();
                break;
            case Teletransporte:
                instanciaMovimiento = new Teletransporte ();
                break;
                */ 
             default:
               throw new AssertionError();
        }
        instanciaMovimiento.utilizar(this, oponente);
    }
}
