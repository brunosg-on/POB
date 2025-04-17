import java.util.Scanner;
public class GerenciadorConta 
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do titular: ");
        String nome = sc.nextLine();
        DominioContaBancaria conta = new DominioContaBancaria(nome);

        int op = 0;
        while(op != 4)
        {
            System.out.println("1 Deposito\n2Saque\n3Visualizar Saldo\n4 Sair");
            op = sc.nextInt();
            switch(op)
            {
                case 1:
                {

                    System.out.println("Digite o valor para o deposito:");
                    double valor = sc.nextDouble();
                    depositar(valor);
                    break;
                }
                case 2:
                System.out.println("Digite o valor para o sacar:");
                    double valor = sc.nextDouble();
                    sacar(valor);
                    break;
                case 3:
                {
                    exibirSaldo();
                    break;
                }
                default:
                {
                    System.out.println("Opção invalida:");
                }
            }


        }
        sc.close();
    }
}
