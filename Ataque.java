public abstract class Ataque {
    private String poder;

    public abstract void atacar();

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getPoder() {
        return this.poder;
    }
}
