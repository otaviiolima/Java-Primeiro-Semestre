import java.util.Scanner;

public class Questão2Atividade1 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println("Maior de Idade!");
        } else if (idade < 18) {
            System.out.println("Menor de Idade!");

        }

    }
}
