public class produto 
{
    private int codigo;
    private String descricao;
    private double valor;
    
    public produto(int codigo, String descricao, double valor)
    {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
    }
    public int getcodigo()
    {
        return codigo;
    }
    public String getdescricao()
    {
        return descricao;
    }
    public double getvalor()
    {
        return valor;
    }
    public void setcodigo(int codigo)
    {
        this.codigo = codigo;
    }
    public void setdescricao(String descricao)
    {
        this.descricao = descricao;
    }
    public void listarproduto()
    {
        System.out.println(codigo);
        System.out.println(descricao);
        System.out.println(valor);
    }
}
