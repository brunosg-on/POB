import java.util.ArrayList;
import java.util.Scanner;
public class Media 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int quant = 0, total = 0;
        ArrayList<Double> notaA = new ArrayList<>();
        System.out.println("Digite uma nota:");
        double nota = scanner.nextDouble();
        while(nota!=-1)
        {
            notaA.add(nota);
            total += nota;
            quant++;
            System.out.println("Digite uma nota:");
            nota = scanner.nextDouble();
        }
        System.out.println(total/quant);
        scanner.close();
    }
}
