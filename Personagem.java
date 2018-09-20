public abstract class Personagem {

    private Ataque ataque;
    private Pulo pulo;
    private Corrida corrida;

    public void setStratey(Ataque ataque, Pulo pulo, Corrida corrida) {
        this.ataque = ataque;
        this.pulo = pulo;
        this.corrida = corrida;
    }

    public void atacar() {
        this.ataque.atacar();
    }

    public void pular() {
        this.pulo.pular();
    }

    public void correr() {
        this.corrida.correr();
    }

}
