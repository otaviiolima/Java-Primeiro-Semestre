import java.util.Scanner;

public class Questão3Atividade1 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número");
        int numero = scanner.nextInt();

        if (numero %2 == 0 ) {
            System.out.println("Par!");
        } else {
            System.out.println("Ímpar!");
            
        }

    }

}
