/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itsur.pokebatalla.model.Moves;

/**
 *
 * @author Josue Imanol Saavedra Mandujano
 */
public class WINGATTACK extends MovimientoEstado {
    public WINGATTACK  ()
    {
        this.puntosPoder = 10;
        this.precision = 0;
        this.potencia = 0;
        this.tipo = Movimiento.TiposDeMovimiento.FUEGO;
    }
}
