public abstract class CartaNaves extends Carta implements IAtacable{

    public int puntosDefensa;
    public int unidadesOro;

    public CartaNaves(String nombreCarta, int precio, int puntosDefensa, int unidadesOro) {
        super(nombreCarta, precio);
        this.puntosDefensa = puntosDefensa;
        this.unidadesOro = unidadesOro;
    }

    public void setPuntosDefensa(int puntosDefensa) throws ErrorJuegoException {
        if(puntosDefensa < 4){
            throw new ErrorJuegoException("No se puede inicializar a cero los puntos de defensa");
        }
        this.puntosDefensa = puntosDefensa;
    }

    @Override
    public void serAtacado() {

    }

}
