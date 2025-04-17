import java.util.Scanner;
public class GeranciarFuncionario 
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome");
        String nome = sc.nextLine();

        System.out.println("Digite o salario");
        double salario = sc.nextDouble();

        System.out.println("Digite a categoria");
        String categoria = sc.nextLine();

       Funcionario funcionario = new Funcionario(nome,salario,categoria);
        System.out.printf("Salario final: %.2f", funcionario.CalcularSalario(salario, categoria));
        sc.close();
        
    }
}
