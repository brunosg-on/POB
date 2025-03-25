
import java.util.Scanner;

public class NumerosParesEmUmArray 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int vet[] = new int[8];
        int cont = 0;
        
        for(int i=0;i<8;i++)
        {
            System.out.println("Digite um numero");
            vet[i] = sc.nextInt();
            if(vet[i]%2 == 0)
            {
                cont++;
            }
            
        }

        for(int i=0;i<8;i++)
        {
            if(vet[i]/2 == 0)
            {
                System.out.println(vet[i]);
            } 
        }
        System.out.println("numeros pares "+cont);   
    }
}
