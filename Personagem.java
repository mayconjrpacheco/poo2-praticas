import java.util.Observable;

public abstract class Personagem extends Observable {

    private Ataque ataque;
    private Pulo pulo;
    private Corrida corrida;
    private int x = 0;
    private int y = 0;
    private int life = 0;
    private Escudo escudo;

    public void setEscudo(Escudo escudo) {
        this.escudo = escudo;
    }

    public Escudo getEscudo() {
        return escudo;
    }

    public void Dano(int dano) {
        this.life = this.life - dano;

        if (this.life <= 0) {
            System.out.println("Personagem morreu");
        }
    }

    public void setStratey(Ataque ataque, Pulo pulo, Corrida corrida) {
        this.ataque = ataque;
        this.pulo = pulo;
        this.corrida = corrida;
    }

    public void atacar() { this.ataque.atacar(); }

    public void pular() {
        this.pulo.pular();
    }

    public void correr() {
        this.corrida.correr();
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setPoder(String poder) {
        this.ataque.setPoder(poder);
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getLife() {
        return this.life;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void show() {
        setChanged();
        notifyObservers();
    }


}
