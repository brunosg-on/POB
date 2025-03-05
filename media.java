import java.util.Scanner;

public class media {
    
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int i = 0, media = 0;
        double nota[] = new double[3];
        
        for(i=0;i<3;i++)
        {
            System.out.print("Digite o valor nota: ");
            nota[i] = entrada.nextDouble();
            media += nota[i];

        }

        System.out.print("A media é " + media/3 );
    }
}
