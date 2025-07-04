import java.util.Scanner;
public class Imc {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    double peso, altura, imc;
    
    System.out.println("Digite seu peso (em kg): ");
    peso = scanner.nextDouble();
    System.out.println("Digite sua altura (em metros): ");
    altura = scanner.nextDouble();
    imc = peso/Math.pow(altura, 2);

    if (imc <= 18.5) {
        System.out.println("Seu IMC é " + imc + ". Abaixo do peso.");
    } else if (imc >= 18.6 && imc <= 24.9) {
        System.out.println("Seu IMC é " + imc + ". Peso ideal.");
    } else if (imc >= 25.0 && imc <= 29.9) {
        System.out.println("Seu IMC é : " + imc + ". Levemente acima do peso.");
    } else if (imc >= 30 && imc <= 34.9) {
        System.out.println("Seu IMC é : " + imc + ". Obesidade grau I.");
    } else if (imc >= 35 && imc <= 39.9) {
        System.out.println("Seu IMC é: " + imc + ". Obesidade grau II.");
    }
    else {
        System.out.println("Seu IMC é: " + imc + ". Obesidade grau III ou mórbida.");
    } 
}
}
