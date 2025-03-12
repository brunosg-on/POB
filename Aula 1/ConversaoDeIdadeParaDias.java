import java.util.Scanner;
public class ConversaoDeIdadeParaDias 
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a idade: ");
        int idade = entrada.nextInt();
        int dias = idade * 365;
        System.out.print("Quantidade aproximado de dias "+ dias );
        entrada.close();
    }   

}
