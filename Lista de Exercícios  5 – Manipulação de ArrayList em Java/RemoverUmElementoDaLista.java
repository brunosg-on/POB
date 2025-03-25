import java.util.ArrayList;
import java.util.Scanner;
public class RemoverUmElementoDaLista 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> Anome = new ArrayList<String>();

        for(int i=0;i<5;i++)
        {
            System.out.println("Digite um nome para adicinar:");
            Anome.add(sc.nextLine());
        }
        System.out.println("Digite um nome para remover:");
        String nomeR = sc.nextLine();

        for(int i=0;i<5;i++)
        {
            if(Anome.remove(nomeR))
            {
                System.out.println("Nome Removido:");
            }
        }
        System.out.println(Anome);
    }
    
    
}
