import java.util.Scanner;
// Comando para importar a biblioteca Scanner, que permite a leitura de dados do usuário.
public class PJ04 {
    public static void main(String[] args){

        String nome,sobrenome;

        Scanner leitor= new Scanner(System.in);
        // Criação de um objeto leitor da classe Scanner para ler dados do usuário, "leitor" é o nome do objeto.

        System.out.println("Este programa inverterá nome e sobrenome.");

        System.out.println("Digite seu nome: ");
        nome = leitor.next();

        System.out.println("Digite seu sobrenome: ");
        sobrenome = leitor.next();

        System.out.println(sobrenome + ", " + nome);

    }
    
}
