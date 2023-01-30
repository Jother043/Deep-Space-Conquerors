public class CartaNaves extends Carta implements IAtacable, IAtacador {

    public enum Tnaves {
        TRANSPORTE(4), CARGA(4), ATAQUE(7);
        private int puntosDefensa;

        Tnaves(int puntosDefensa) {
            this.puntosDefensa = puntosDefensa;
        }

        public int getPuntosDefensa() {
            return puntosDefensa;
        }
    }
    private int unidadesOro;

    public CartaNaves(String nombreCarta, double precio, int unidadesOro) {
        super(nombreCarta, precio);
        this.unidadesOro = unidadesOro;
    }

    @Override
    public void serAtacado() {

    }

    @Override
    public void atacar() {

    }
}
