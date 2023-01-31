public class NaveAtaque extends CartaNaves{

    public NaveAtaque(String nombreCarta, int precio, int puntosDefensa, int unidadesOro) {
        super(nombreCarta, precio, puntosDefensa, unidadesOro);

    }

    @Override
    public void setPuntosDefensa(int puntosDefensa) throws ErrorJuegoException {
        super.setPuntosDefensa(puntosDefensa);
    }
}
