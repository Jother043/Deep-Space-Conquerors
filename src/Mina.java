public class Mina extends Carta {

    public enum Tmaterial{
        PIEDRA, ORO, HIERRO, COMBUSTIBLE
    }
    private int cantidadMinadaPorTurno;

    public Mina(String nombreCarta, double precio, int cantidadMinadaPorTurno) {
        super(nombreCarta, precio);
        this.cantidadMinadaPorTurno = cantidadMinadaPorTurno;
    }

    public int getCantidadMinadaPorTurno() {
        return cantidadMinadaPorTurno;
    }
}
