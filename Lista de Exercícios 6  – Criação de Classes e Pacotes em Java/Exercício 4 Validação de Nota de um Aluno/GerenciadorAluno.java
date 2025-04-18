import java.util.Scanner;
public class GerenciadorAluno 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do aluno");
        String nome = sc.nextLine();

        System.out.println("Digite a nota do aluno");
        double nota = sc.nextDouble();
        Aluno aluno = new Aluno(nome, nota);
        aluno.ValidarNota(nota);
        sc.close();
    }
}
