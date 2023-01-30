public class Main {
    public static void main(String[] args) {
        try {
            Dado dA = new Dado(4, 2);
            Dado dB = new Dado(6, 10);
            Dado dC = new Dado(12, 1);
            System.out.println(dA.lanzar());
            System.out.println(dB.lanzar());
            System.out.println(dC.lanzar());
        } catch (ErrorJuegoException e) {
            e.printStackTrace();
        }


    }
}