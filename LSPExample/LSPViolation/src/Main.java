public class Main {
    public static void main(String[] args) {
        Kopi kopiBiasa = new Kopi();
        kopiBiasa.brew(); // Ini berjalan dengan baik
        
        Kopi espresso = new Espresso();
        espresso.brew(); // Ini akan melempar UnsupportedOperationException
    }
}