public class main {
    public static void main(String[] args) throws InterruptedException {
        Personagem01 personagem01 = new Personagem01(500, 10, 10);
        Personagem02 personagem02 = new Personagem02();
        Personagem03 personagem03 = new Personagem03();

        Inimigo inimigo01 = new Inimigo(20, 0);
        Inimigo inimigo02 = new Inimigo(100, 300);
        Inimigo inimigo03 = new Inimigo(1000, 300);

        personagem01.addObserver(inimigo01);
        personagem01.addObserver(inimigo02);
        personagem01.addObserver(inimigo03);

        while(true) {
            personagem01.show();
            Thread.sleep(1000);
        }

    }
}
