import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int num1, num2 = 0;
        String opcao;

        System.out.println("Digite o primeiro número: ");
        num1 = scanner.nextInt();
        do {
            System.out.println("Digite um número MAIOR que o primeiro: ");
            num2 = scanner.nextInt();
        } while (num2 <= num1);
        System.out.println("Digite 'par' ou 'impar': ");
        opcao = scanner.next();
        switch (opcao.equalsIgnoreCase("par") ? "par" : "impar") {
            case "par":
                for (int i = num2; i >= num1; i--){
                    if (i % 2 == 0) {
                        System.out.println(i);
                    }
                }
                break;
            case "impar":
                for (int i = num2; i >= num1; i--){
                    if (i % 2 != 0) {
                        System.out.println(i);
                    }
                }
            default:
                break;
        }
    }

}
