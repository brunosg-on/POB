import java.util.Scanner;
public class CalculoDoSalário 
{
    public static void main (String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o sálario bruto: ");
        double SalarioB = entrada.nextDouble();
        System.out.print("Digite o valor de desconto do INSS: ");
        double INSS = entrada.nextDouble();
        double SalarioL = SalarioB - (SalarioB * INSS)/100;
        System.out.print("O Salário Liquido é: "+ SalarioL);
        entrada.close();
    }    
}
