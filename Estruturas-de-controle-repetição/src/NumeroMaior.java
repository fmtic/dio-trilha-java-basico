import java.util.Scanner;

public class NumeroMaior {
public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o primeiro número: ");
    var num1 = scanner.nextInt();
    var verificador = true;
   while (verificador){
        System.out.println("Digite outro número: ");
        var num2 = scanner.nextInt();
        if (num2 < num1) {
            System.out.println("Informe um número maior que " + num1 + ". Tente novamente.");
            continue;
        }
        var resultado = num2 % num1;
        verificador = resultado == 0;
        System.out.println(num2 +" % "+ num1 + " = " + resultado);
   		}
    }
}