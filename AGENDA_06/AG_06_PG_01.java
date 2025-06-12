package AGENDA_06;

// Agenda focada em estruturas de decisao //
import java.util.Scanner;

public class AG_06_PG_01 {
    public static void main(String[] args){

        int idade; //armazena a idade//

        Scanner leitor = new Scanner(System.in); //Criação objeto "leitor" para inserir dados//

        System.out.println("Digite sua idade: ");
        idade = leitor.nextInt(); //Lê a idade digitada pelo usuário e armazena na variável idade//

        if (idade >= 18) { //verifica se a idade é maior que 18//
            System.out.println("Você é maior de idade!");
        }
    }
}