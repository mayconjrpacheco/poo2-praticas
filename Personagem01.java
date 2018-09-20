public class Personagem01 extends Personagem {
    public Personagem01(int life, int x, int y) {
        setStratey(new AtaqueForte(), new PuloMedio(), new CorridaMedia());
        setPosition(x, y);
        setLife(life);
    }
}
