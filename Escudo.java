public abstract class Escudo {

    private Escudo escudo;

    public void setEscudo(Escudo escudo) {
        this.escudo = escudo;
    }

    public Escudo getEscudo() {
        return escudo;
    }

    public abstract void processaEscudo(Personagem personagem, Ataque ataque);
}
