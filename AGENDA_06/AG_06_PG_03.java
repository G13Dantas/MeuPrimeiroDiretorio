package AGENDA_06;

import javax.swing.JOptionPane; // Importando a biblioteca JOptionPane para exibir diálogos de entrada e saída //

public class AG_06_PG_03 {
    public static void main(String[] args){

        // Declarando variáveis //
        int idade;

        java.util.Scanner leitor = new java.util.Scanner(System.in);
        // Lendo a idade do usuário //

        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
        // Verificando se a idade é maior ou igual a 18 //

        // Estrutura de decisão //
    if (idade>=18){
            if (idade == 18){
                JOptionPane.showMessageDialog(null,"Você tem 18 anos!");
            } 
            else {
                JOptionPane.showMessageDialog(null,"Você é maior de idade!");
            }
    }
    else {
            JOptionPane.showMessageDialog(null,"Você é menor de idade!");
        }
    
    }
    
}

