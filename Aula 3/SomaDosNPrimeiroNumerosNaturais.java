import java.util.Scanner;
public class SomaDosNPrimeiroNumerosNaturais
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero = entrada.nextInt(), i, soma = 0;

        for(i=1;i <= numero;i++)
        {
            soma += i;
        }
        System.out.println(soma);
        entrada.close();
    }

}