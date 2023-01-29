public class Dado implements Ilanzable{

    private int numCaras;
    private int numMinCara;
    private int numMaxCara;

    public Dado(int numCaras, int numMinCara, int numMaxCara) throws ErrorJuegoException {
        setNumCaras(numCaras);
        this.numMinCara = numMinCara;
        this.numMaxCara = numMaxCara;
    }

    public void setNumCaras(int numCaras) throws ErrorJuegoException {
        if (numCaras != 4 && numCaras != 12 && numCaras != 6 ){
            throw new ErrorJuegoException("No puede ser un número de caras distinto a ");
        }
        this.numCaras = numCaras;
    }

    public void setNumMinCara(int numMinCara) {

        this.numMinCara = numMinCara;
    }

    public void setNumMaxCara(int numMaxCara) {
        this.numMaxCara = numMaxCara;
    }

    @Override
    public void lanzar() {

    }

    @Override
    public int getMin() {
        return 0;
    }

    @Override
    public int getMax() {
        return 0;
    }
}
