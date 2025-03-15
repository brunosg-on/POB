import java.util.Scanner;
public class CaculoDaMediaDeNotas 
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int nota[] = new int[4], i;
        double media = 0;
       

        for(i=0;i<4;i++)
        {
            System.out.println("Digite a nota: "+ (i+1)+ "/" + 4);
            nota[i] = entrada.nextInt();
            media += nota[i];
        }
        media /= 4;
        if ((media) < 7) 
        {
            System.out.println("media = "+ media + " Reprovado");
        }
       else
       {
        System.out.println("media = "+ media + " Aprovado");
       }
        entrada.close();

    }
}
