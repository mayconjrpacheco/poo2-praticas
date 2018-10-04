public abstract class Ataque {
    private String poder;
    private int dano;
    private String descricao;

    public abstract void atacar();

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getPoder() {
        return this.poder;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public int getDano() {
        return dano;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}

