import java.util.Scanner;
//Comando para importar a biblioteca Scanner, que permite a leitura de dados do usuário.

public class PJ02 {
    public static void main(String[]args){

        //declaração de variaveis
        int numero1, numero2, soma;

        Scanner leitor = new Scanner(System.in);
        //Criação de um objeto leitor da classe Scanner para ler dados do usuário,"leitor" é o nome do objeto.

        System.out.println("Digite o primeiro valor: ");
        numero1 = leitor.nextInt();
        //Solicita ao usuário que digite o primeiro valor e armazena na variável numero1.

        System.out.println("Digite o segundo valor: ");
        numero2 = leitor.nextInt();
        //Solicita ao usuário que digite o segundo valor e armazena na variável numero2.

        soma = numero1 + numero2;
        //Calcula a soma dos dois números e armazena na variável soma.PROCESSAMENTO DE DADOS.

        System.out.println("O resultado da soma é: " + soma);
        //Exibe o resultado da soma na tela.
    }

}
