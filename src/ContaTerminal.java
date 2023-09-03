import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do titular da conta");
        String clienteConta = scanner.nextLine();

        System.out.println("Digite o numero da conta");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite a agencia");
        String agenciaConta = scanner.next();

        double saldo = 2324.48;

        System.out.println("Olá " + clienteConta + ", obrigado por criar uma conta em nosso banco, sua agencia é " + agenciaConta + " conta " + numeroConta + " e seu saldo ja está diponível para o saque no valor de R$" + saldo + " desde já agradecemos a preferência");

    }
}
