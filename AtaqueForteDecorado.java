public abstract class AtaqueForteDecorado extends AtaqueForte {

    private AtaqueForte ataqueForteDecorado;

    public AtaqueForteDecorado(AtaqueForte ataqueForteDecorado) {
        this.ataqueForteDecorado = ataqueForteDecorado;
    }

    public void atacar() {
        ataqueForteDecorado.atacar();
        System.out.println(this.getPoder());
    }
}
