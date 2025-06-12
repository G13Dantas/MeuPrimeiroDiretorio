package AGENDA_06;

import java.util.Scanner;
// Agenda focada em estruturas de decisao //

public class AG_06_PG_02 { //IF Composto//

    public static void main(String[] args){
        
        int idade; // armazena idade //

        Scanner leitor = new Scanner(System.in); // criação de objeto "leitor" para inserir dados //
        
        System.out.println("Digite sua idade: ");
        idade = leitor.nextInt(); // lê a idade digitada pelo usuário e armazena na variável idade //

        //Decisão//
        if (idade>=18) { // verifica se a idade é maior ou igual a 18 //
            System.out.println("Você é maior de idade!");
         } 
        else { // comando se a condição for falsa //
            System.out.println("Você é menor de idade!");
        }
    }
    
}
