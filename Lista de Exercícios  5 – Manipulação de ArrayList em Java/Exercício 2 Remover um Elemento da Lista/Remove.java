import java.util.ArrayList;
import java.util.Scanner;
public class Remove 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> Anome = new ArrayList<>();

        for(int i=0;i<5;i++)
        {
            System.out.println("Digite um nome para adicinar:");
            Anome.add(sc.nextLine());
        }

        System.out.println("Digite um nome para remover:");
        Anome.remove(sc.nextLine());
        System.out.println(Anome);
        sc.close();
    }
}
