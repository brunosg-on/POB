import java.util.Scanner;

public class ParOuImpar
{
    public static void main (String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um numero ");
        int numero = entrada.nextInt();
        if(numero%2==0)
        {
            System.out.print("Numero par");
        }
        else
        {
            System.out.print("Numero impar");
        }
        entrada.close();
    }
}