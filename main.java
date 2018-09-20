public class main {
    public static void main(String[] args) {
        Personagem01 personagem01 = new Personagem01();
        Personagem02 personagem02 = new Personagem02();
        Personagem03 personagem03 = new Personagem03();

        System.out.println("Personagem 01:");
        personagem01.atacar();
        personagem01.pular();
        personagem01.correr();
        System.out.println("");

        System.out.println("Personagem 02:");
        personagem02.atacar();
        personagem02.pular();
        personagem02.correr();
        System.out.println("");

        System.out.println("Personagem 03:");
        personagem03.atacar();
        personagem03.pular();
        personagem03.correr();
    }
}
