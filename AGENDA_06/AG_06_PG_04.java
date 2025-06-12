package AGENDA_06;
//Agenda focada em conversão de dados//
import javax.swing.JOptionPane; // Importando a biblioteca JOptionPane para exibir diálogos de entrada e saída//
public class AG_06_PG_04 {
    public static void main(String[] args){
        String auxiliar;
        int numeroInt;
        double numerodouble;
        float numerofloat;

        //entrada de dados//
        auxiliar = JOptionPane.showInputDialog("Digite um número inteiro: ");

        //conversão do tipo string para inteiro//
        numeroInt = Integer.parseInt(auxiliar);
        numerodouble = Double.parseDouble(auxiliar);
        numerofloat = Float.parseFloat(auxiliar);

        //saída de dados//
        JOptionPane.showMessageDialog(null,
        "O número inteiro é "+numeroInt + 
        "\nO número double é "+numerodouble +
        "\nOnúmero float é " + numerofloat);


    }
    
}