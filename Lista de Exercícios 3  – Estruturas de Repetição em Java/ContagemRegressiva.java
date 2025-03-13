import java.util.Scanner;
public class ContagemRegressiva 
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero para a contagem regressiva");
        int n = entrada.nextInt();
        System.out.println("Iniciando a contagem regressiva");
        do
        {
            System.out.println(n);
            n -= 1;
        }
        while(n > 0);

        entrada.close();
    }

}  