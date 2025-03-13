import java.util.Scanner;
public class TabuadaDeUmNumero 
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int n = entrada.nextInt(), i = 1;
        System.out.println("Tabuada de " + n);
        while(i<=10)
        {
            System.out.println( i + "x"+ n +" = " + i*n);
            i++;
        }
        entrada.close();
    }
}
