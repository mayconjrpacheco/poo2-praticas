public class AtaqueFraco extends Ataque {
    public void atacar() {
        System.out.println("Ataque fraco");
        setDano(3);
        setDescricao("Fraco");
    }
}
