public class Planeta {

    private String nombre;
    private Jugador conquistador;
    private int habitantes;
    private int piedra;
    private int hierro;
    private int combustible;
    private Mina[] minas;
    private int escudoProtector;

    public Planeta(String nombre, Jugador conquistador, int habitantes, int piedra, int hierro, int combustible, Mina[] minas) {
        this.nombre = nombre;
        this.conquistador = conquistador;
        this.habitantes = 30;
        this.piedra = 5;
        this.hierro = 4;
        this.combustible = 2;
        this.minas = new Mina[10];
        this.escudoProtector = 20;
    }


}
