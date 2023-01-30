public class CartaMateriales extends Carta {

    public enum materiales{
        PIEDRA, ORO, HIERRO, COMBUSTIBLE
    }

    public CartaMateriales(String nombreCarta, double precio) {
        super(nombreCarta, precio);
    }
}
