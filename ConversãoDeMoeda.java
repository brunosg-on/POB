import java.util.Scanner;
public class ConversãoDeMoeda {
    public static void main (String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o valor em Reais: ");
        double Reais = entrada.nextDouble();
        Double Dollar = Reais * 5.89;
        System.out.print("o Valor em dolares é "+ Dollar);
        entrada.close();
    }
    
}
