public class DominioContaBancaria 
{
    private String titular;
    private double saldo;

    public DominioContaBancaria(String titular)
    {
        this.titular = titular;
        this.saldo = 0.0;
    }
    public String getTitular()
    {
        return titular;
    }
    public void setTitular(String titular)
    {
        this.titular = titular;
    }
    public double getSaldo()
    {
        return saldo;
    }
    public void setSaldo(double saldo)
    {
        this.saldo = saldo;
    }
    public void depositar(double valor)
    {
        if(valor > 0)
        {
            saldo += valor;
            System.out.println("Deposito de R$ "+ valor + "realizado com sucesso!");
        }
        else
        System.out.println("Saldo insuficiente!");
    }
    public void sacar(double valor)
    {
        if(valor <= saldo)
        {
            saldo -= valor;
            System.out.println("Saque de R$ "+ valor + "realizado com sucesso!");
        }
         else
        System.out.println("Saldo insuficiente!");
    }
    public void exibirSaldo()
    {
        System.out.printf("Saldo Todal de %s: %.2f", titular, saldo);
    }
}