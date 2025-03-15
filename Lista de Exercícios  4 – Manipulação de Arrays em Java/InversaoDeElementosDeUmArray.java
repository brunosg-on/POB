import java.util.Scanner;
public class InversaoDeElementosDeUmArray
{
    public static void main(String[] args) 
    {   
        Scanner entrada = new Scanner(System.in);
        int v[] = new int[6], i;

        for(i=0;i<6;i++)
        {
            System.out.println("Digite o valor " + (i+1)+ "/" + 6);
            v[i] = entrada.nextInt();
        }
        System.out.println("Vetor inverso");
        for(i=5;i >=0;i--)
        {
            System.out.println (v[i]);
        }
        entrada.close();

    }

}