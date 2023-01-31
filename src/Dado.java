public class Dado implements Ilanzable {

    private final int NUM_MIN_CARA = 4;
    private int numCaras;
    private int numMinPuntosCara;

    public Dado(int numCaras, int numMinPuntosCara) throws ErrorJuegoException {
        setNumCaras(numCaras);
        setNumMinCara(numMinPuntosCara);
        getMax();
    }

    private void setNumCaras(int numCaras) throws ErrorJuegoException {
        if (numCaras < NUM_MIN_CARA) {
            throw new ErrorJuegoException("No puede ser un número de caras menor a " + NUM_MIN_CARA);
        }
        this.numCaras = numCaras;
    }

    private void setNumMinCara(int numMinCara) throws ErrorJuegoException {
        if (numMinCara < 0) {
            throw new ErrorJuegoException("No puede ser un número ");
        }
        this.numMinPuntosCara = numMinCara;
    }

    public int getNumCaras() {
        return numCaras;
    }

    public int getNumMinCara() {
        return numMinPuntosCara;
    }

    @Override
    public int getMin() {

        return getNumMinCara();
    }

    @Override
    public int getMax() {

        return (getMin() + getNumCaras() - 1);
    }

    @Override
    public int lanzar() {

        return (int) (Math.random() * (getMax() - getMin() + 1)) + getMin();
    }
}
