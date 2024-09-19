import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Seja Bem Vindo!");
        System.out.println("Me forneça as seguintes informações sobre a sua conta: ");

        System.out.println("Qual é o seu nome? ");
        String nome = sc.next();
        sc.next();
        System.out.println("Insira sua agência: ");
        String agencia = sc.next();
        System.out.println("Insira sua conta: ");
        int conta = sc.nextInt();
        System.out.println("Insira seu saldo: ");
        Double saldo = sc.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é "
        + agencia + ", conta " + conta + " e seu saldo des " + saldo + " já está disponível para saque.");

        sc.close();
    }
}
