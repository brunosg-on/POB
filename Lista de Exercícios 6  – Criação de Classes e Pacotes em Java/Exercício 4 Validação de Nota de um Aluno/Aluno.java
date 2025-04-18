public class Aluno 
{
    private String nome;
    private double nota;

    public Aluno(String nome, double nota)
    {
        this.nome = nome;
        this.nota = nota;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    public double getNota()
    {
        return nota;
    }
    public void setNota(double nota)
    {
        this.nota = nota;
    }
    public void ValidarNota(double nota)
    {
        if(nota >= 0 && nota <=10)
        {
            if(nota >= 7)
            {
                System.out.println("Aprovado!");
            }
            else
            {
                if(nota >= 5)
                {
                    System.out.println("Recuperaçao!");
                }
                else
                {
                    System.out.println("Reprovado!");
                }
            } 
        }
    }
}
