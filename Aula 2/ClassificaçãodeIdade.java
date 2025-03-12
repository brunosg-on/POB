import java.util.Scanner;
public class ClassificaçãodeIdade {
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite uma Idade: ");
        int idade = entrada.nextInt();
        if(idade < 18)
        {
            System.out.print("Menor de Idade");
        }
        else
        {
            if(idade < 60)
            {
                System.out.print("Adulto");
            }
            else
            {
                System.out.print("Idoso");
            }
        }
        entrada.close();
    }  
    
}
