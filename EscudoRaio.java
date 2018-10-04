public class EscudoRaio extends Escudo
{
    public void processaEscudo(Personagem personagem, Ataque ataque)
    {
        if(ataque.getDescricao().contains("medio") )
        {
            ataque.setDano(ataque.getDano() - 3);
        }

        if(this.getEscudo() != null)
            getEscudo().processaEscudo(personagem, ataque);
    }
}