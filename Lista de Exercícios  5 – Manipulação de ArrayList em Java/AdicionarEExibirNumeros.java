
import java.util.ArrayList;
import java.util.Scanner;
public class AdicionarEExibirNumeros 
{
    public static void main (String[] args)
    {
        Scanner entrada = new  Scanner(System.in);
        ArrayList<Integer> n = new ArrayList<>();

        System.out.println("Digite um numero ou 0 para sair");
        int digito = entrada.nextInt();
        while(digito != 0)
        {   
            n.add(digito);
            System.out.println("Digite um numero ou 0 para sair");
            digito = entrada.nextInt();
        }

        System.out.println(n);
        entrada.close();
    }
}
