import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) throws Exception {
        //TODO:Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in);

        //Exibir as mensagens para nosso usuário
        System.out.println("Olá! Por favor, digite seu nome e pressione Enter:");
        //Obter o nome do usuário
        String nome = scanner.nextLine();
        System.out.println("Por favor, digite o número da agência (xxx-x) e pressione Enter:");
        
        //Obter o número da agência
        String agencia = scanner.next();
        System.out.println("Agora, digite o número da conta (xxxx) e pressione Enter:");
        
        //Obter o número da conta
        String conta = scanner.next();
        System.out.println("Para finalizar, digite o saldo inicial (xx,xx) e pressione Enter:");
        
        //Obter o saldo inicial
        Double saldo = scanner.nextDouble();

        //Exibir a mensgaem final com os dados informados
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é "
        + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque");
        
    }
}
