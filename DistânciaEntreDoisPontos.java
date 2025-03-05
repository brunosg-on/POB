import java.util.Scanner;

public class DistânciaEntreDoisPontos 
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o valo de X1: ");
        double X1 = entrada.nextDouble();

        System.out.print("Digite o valo de X2: ");
        double X2 = entrada.nextDouble();

        System.out.print("Digite o valo de Y1: ");
        double Y1 = entrada.nextDouble();

        System.out.print("Digite o valo de Y2: ");
        double Y2 = entrada.nextDouble();

        double distancia = Math.pow(X2-X1, 2) + Math.pow(Y2-Y1,2);
        System.out.print("A distancia entre os dois pontos é: "+ distancia);

        entrada.close();
    }
    

}
