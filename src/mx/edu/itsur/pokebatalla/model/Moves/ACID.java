package mx.edu.itsur.pokebatalla.model.Moves;

/**
 *
 * @author Josue Imanol Saavedra Mandujano
 */
public class ACID extends MovimientoEstado{
    public ACID  ()
    {
        this.puntosPoder = 20;
        this.precision = 100;
        this.potencia = 65;
        this.tipo = Movimiento.TiposDeMovimiento.VENENO;
    }
    
}
