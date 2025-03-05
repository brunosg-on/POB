import java.util.Scanner;
public class CálculoDoVolumeDeUmaEsfera 
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o Raio da Esfrera: ");
        Double Raio = entrada.nextDouble();

        final double pi = 3.14159;
        double volume = (4/3) *pi * Math.pow(Raio,3);
        System.out.print("O valume é: "+ volume);
        entrada.close();
    }

}
