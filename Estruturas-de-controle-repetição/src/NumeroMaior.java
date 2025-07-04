import java.util.Scanner;

public class NumeroMaior {
public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    int num1, num2 = 0;
    System.out.println("Digite o primeiro número: ");
    num1 = scanner.nextInt();
    do {
        System.out.println("Digite outro número: ");
        num2 = scanner.nextInt();
        if (num2 <= num1) {
            System.out.println("O segundo número deve ser maior que o primeiro. Tente novamente.");
        }
    }while (num2 % num1 == 0);
    System.out.println(num2 + "/" + num1 + " não têm quociente 0");
    }
}
