public class EscudoFogo extends Escudo
{
    public void processaEscudo(Personagem personagem, Ataque ataque)
    {
        if(ataque.getDescricao().contains("forte") )
        {
            ataque.setDano(ataque.getDano() - 5);
        }

        if(this.getEscudo() != null)
            getEscudo().processaEscudo(personagem, ataque);
    }
}