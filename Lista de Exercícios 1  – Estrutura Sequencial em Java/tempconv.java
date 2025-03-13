import java.util.Scanner;

public class tempconv
{
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a temperatura em celsius ");
        double celsius = entrada.nextDouble();

        double farenheit  = (celsius * 9/5) + 32;
        System.out.println("A temperatura em Farenheit é: " + farenheit);
        entrada.close();
    }
}