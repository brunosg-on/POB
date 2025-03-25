import java.util.Scanner;
public class controle 
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite a idade: ");
        int idade = entrada.nextInt();

        System.out.print("Digite a Altura: ");
        double altura = entrada.nextDouble();

        System.out.print("Digite o peso: ");
        double peso = entrada.nextDouble();

        System.out.print("Digite o sexo: ");
        char sexo = entrada.next().charAt(0);

        Pessoa pessoa = new Pessoa(nome, idade, altura, peso, sexo);
        pessoa.listarpessoa();
        System.out.println(pessoa.calcularIMC());
        System.out.println(pessoa.classificarIMC());
        entrada.close();
    }

    }
   
