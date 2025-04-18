public class Elevador 
{
    private int andarAtual;
    private int andarTotal;

    public Elevador(int andarAtual, int andarTotal)
    {
        this.andarAtual = andarAtual;
        this.andarTotal = andarTotal;
    }
    public int getAndarAtual()
    {
        return andarAtual;
    }
    public void setAndarAtual(int andarAtual)
    {
        this.andarAtual = andarAtual;
    }
    public int getAndarTotal()
    {
        return andarTotal;
    }
    public void setAndarTotal(int andarTotal)
    {
        this.andarTotal = andarTotal;
    }
    public void subir(int andarAtual, int andarTotal)
    {
        if(andarAtual< andarTotal)
        {
            andarAtual += 1;
            System.out.println("Subiu para o andar "+ andarAtual);
        }
        else
        {
            System.out.println("Andar indisponivel");
        }
    }

    public void descer(int andarAtual, int andarTotal)
    {
        if(andarAtual > 0)
        {
            andarAtual -= 1;
            System.out.println("Desceu para o andar "+ andarAtual);
        }
        else
        {
            System.out.println("Andar indisponivel");
        }
    }

    public void exibirAtual(int andarAtual)
    {
        System.out.println("Andar Atual "+ andarAtual);
    }
}