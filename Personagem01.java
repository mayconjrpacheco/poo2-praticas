public class Personagem01 extends Personagem {
    public Personagem01(int life, int x, int y) {
        AtaqueForte ataque = new AtaqueForte();
        ataque = new Agua(ataque);
        setStratey(ataque, new PuloMedio(), new CorridaMedia());
        setPosition(x, y);
        setLife(life);
    }
}
