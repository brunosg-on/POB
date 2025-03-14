import java.util.Scanner;
public class MaiorEMenorValorEmUmArray 
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int n = 5;
        int v[] = new int[n], i, maior, menor;
        
        for(i=0;i<n;i++)
        {
            System.out.println("Digite o valor " + (i+1) + "/" + n );
            v[i] = entrada.nextInt();
        }
        maior = v[0]; menor = maior;
        for(i=1;i<n;i++)
        {
            if(v[i] < menor)
            {
                menor = v[i];
            }

            if(v[i] > maior)
            {
                maior = v[i];
            }
        }
        System.out.println("Menor: "+ menor);
        System.out.println("maior: "+ maior);
        entrada.close();
    }
}
