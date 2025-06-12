import java.util.Scanner;


public class PJ05 {
    public static void main(String[] args){

        int num1,num2,mult;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Este programa calculará a multiplicação de dois números inteiros.");

        System.out.println("Digite o primeiro número: ");
        num1 = leitor.nextInt();
        System.out.println("Digite o segundo número: ");
        num2 = leitor.nextInt();
        mult = num1 * num2;
        System.out.println("A multiplicação dos números resulta em: " + mult);

    }
}
