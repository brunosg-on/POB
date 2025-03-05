import java.util.Scanner;
public class CálculoDoPerímetroEÁreaDeUmRetângulo 
{
   public static void main (String[] args)
   {
    Scanner entrada = new Scanner(System.in);
    System.out.print("Digite a Base: ");
    double Base = entrada.nextDouble();
    System.out.print("Digite a Altura: ");
    double Altura = entrada.nextDouble();

    double Area = Base * Altura;
    double Perimetro = 2 * (Base + Altura);
    System.out.print("A Area é "+ Area +"\nO perimetro é " + Perimetro);
    entrada.close();

   } 
}
