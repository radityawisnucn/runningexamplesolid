public class Main {
    public static void main(String[] args) {
        Brewable kopiBiasa = new Kopii();
        kopiBiasa.brew(); // Ini berjalan dengan baik
        
        Brewable espresso = new Espressoo();
        espresso.brew(); // Ini juga berjalan dengan baik, sesuai LSP
    }
}