import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.println("Digite um número inteiro: ");
        numero = scanner.nextInt();
        System.out.println("A tabuada de " + numero + " é: ");
        for (var i = 1; i <= 10; i++) {
            var produto = numero * i;
            System.out.printf("%s x %s = %s \n", numero, i, produto);
        }
    }
}
