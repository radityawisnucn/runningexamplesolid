class Espresso extends Kopi {
    @Override
    public void brew() {
        throw new UnsupportedOperationException("Espresso memerlukan metode penyeduhan khusus.");
    }

    public void brewSpecialEspresso() {
        System.out.println("Menyeduh espresso khusus...");
    }
}
