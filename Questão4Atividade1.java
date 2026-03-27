import java.util.Scanner;

public class Questão4Atividade1 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro número:");
        int A = scanner.nextInt();

        System.out.println("Informe outro número: ");
        int B = scanner.nextInt();

        if (A==B) {
            System.out.println(" C = " + (A + B));
        } else {
            System.out.println(" C = " + (A * B));
            
        }


    }
}
