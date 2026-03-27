import java.util.Scanner;

public class Questão1Atividade1 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        int a,b,c;

        System.out.println("Digite o primeiro número: ");
        int numA = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int numB = scanner.nextInt();

        System.out.println("Digite o terceiro número: ");
        int numC = scanner.nextInt();

        if (numA + numB > numC) {
            System.out.println("A soma entre os dois números é maior que C!");
        } else if (numA + numB <= numC) {
            System.out.println("A soma entre os dois números não é maior que C!");
        }

    }
}
