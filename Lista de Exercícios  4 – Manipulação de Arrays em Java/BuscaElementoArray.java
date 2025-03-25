import java.util.Scanner;
public class BuscaElementoArray 
{
 public static void main(String[] args) 
 {
   int cont = 0;
    Scanner sc = new Scanner(System.in);
    int v[] = new int[10];

    for(int i=0;i<10;i++)
    {
      System.out.println("Digite um valor");
      v[i] = sc.nextInt();
    }
    System.out.println("Digite um para buscar");
    int buscar = sc.nextInt();

    for(int i=0;i<10;i++)
    {
      if (v[i] == buscar) 
      {
         System.out.println(v[i]+ " Achado na posição " + cont);
      }
      cont++;
    }
    sc.close();   
 }   
}
