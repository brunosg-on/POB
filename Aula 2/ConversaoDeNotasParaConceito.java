import java.util.Scanner;
public class ConversaoDeNotasParaConceito {
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite uma nota: ");
        double nota = entrada.nextDouble();
        if(nota < 3)
        {
            System.out.println("E");
        }
        else
        {
            if(nota < 5)
            {
                System.out.println("D");
            }
            if(nota < 7)
            {
                System.out.println("C");
            }
            if(nota < 9)
            {
                System.out.println("B");
            }
            else
            {
                System.out.println("A");
            }
        }
        entrada.close();
    }
     
}
