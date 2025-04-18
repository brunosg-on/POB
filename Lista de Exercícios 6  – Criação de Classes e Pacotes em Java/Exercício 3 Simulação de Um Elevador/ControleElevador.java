import java.util.Scanner;
public class ControleElevador
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int op=0, total = 10, atual=0;
        Elevador elevador = new Elevador(atual, total);
        while(op!=4)
        {
            System.out.println("1 Subir\n2 Descer\n3 Andar Atual\n4 Sair");
            op = sc.nextInt();

            switch(op)
            {
                case 1:
                elevador.subir(atual,total);
                break;
                case 2:
                elevador.descer(atual,total);
                break;
                case 3:
                elevador.exibirAtual(atual);
                case 4:
                System.out.println("Saindo");
                break;
                default:
                System.out.println("opcão invalida");
            }
        }
        sc.close();
    }
}
