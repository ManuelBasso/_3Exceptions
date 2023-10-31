public class Main {
    public static void main(String[] args) {
        int numero = 10;

        divisione(numero);
    }


    static void divisione(int num) {

        try {
            System.out.println("Risultato: " + num / 0);
        } catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println("Errore nella divisione");
        } finally {
            System.out.println("Fine controllo");
        }
    }
}
