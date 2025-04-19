import java.util.ArrayList;
import java.util.Scanner;
public class Ocorrencias 
{
  public static void main(String[] args) 
  {
    Scanner scanner = new Scanner(System.in);
    int cont = 0;
    ArrayList<Integer> numeros = new ArrayList<>(); 
    for(int i=0;i<10;i++)
    {
      System.out.printf("Digite um numero %d/%d\n", i+1, 10);
      numeros.add(scanner.nextInt());
    }
    System.out.println("Digite um numero para contagem de ocorrencia");
    int numero = scanner.nextInt();
    for(int i:numeros)
    {
      if (i == numero) 
      {
          cont++;
      }
    }

    System.out.println(cont);
    scanner.close(); 
  }  
}
