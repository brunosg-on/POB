public class Funcionario
{
    private String nome;
    private double salario;
    private  String categoria;

    public Funcionario(String nome, double salario, String categoria)
    {
        this.nome = nome;
        this.salario = salario;
        this.categoria = categoria;
    }
    public String getNome()
    {
        return nome;
    }
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    public double getSalario()
    {
        return salario;
    }
    public void setSalario(Double salario)
    {
        this.salario = salario;
    }
    public String getcategoria()
    {
        return categoria;
    }
    public void setCategoria(String categoria)
    {
        this.categoria = categoria;
    }
    public double CalcularSalario(double salario, String categoria)
    {
        switch(categoria.toUpperCase())
        { 
            case "A":
            return salario*1.2;
            case "B":
            return salario*1.1;
            default:
            return salario;
        }
    }
}
