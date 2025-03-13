import java.util.Scanner;
public class NumerosPrimosEmUmIntervalo 
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero de inicio");
        int inicio = entrada.nextInt() ;

        System.out.println("Digite um numero de fim");
        int fim = entrada.nextInt();
        int i, j, mult;
        for(i=inicio;i<fim;i++)
        {
            mult = 0;
            for(j=1;j<i;j++)
            {
                if(i%j == 0)
                {
                   mult++;
                }
            }
            if(mult<2)
            {
                System.out.println(i);
            }
        }
        
        entrada.close();
    }
}
