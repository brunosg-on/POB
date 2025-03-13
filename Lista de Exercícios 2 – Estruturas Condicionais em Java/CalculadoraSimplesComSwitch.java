import java.util.Scanner;

public class CalculadoraSimplesComSwitch {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        double valor1 = entrada.nextDouble();
        System.out.print("Escolha a opercao:\n1 Soma\n2 Subtracao\n3 Multiplicacao\n4 Divicao:\n");
        int op = entrada.nextInt();
        System.out.print("Digite um valor: ");
        double valor2 = entrada.nextDouble();

        switch (op) {
            case 1:
                System.out.print(valor1 + valor2);
                break;

            case 2:
                System.out.print(valor1 - valor2);
                break;

            case 3:
                System.out.print(valor1 * valor2);
                break;

            case 4:
                System.out.print(valor1 / valor2);
                break;

        }
        entrada.close();

    }

}
