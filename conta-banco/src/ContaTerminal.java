import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        
        
        double saldo = 258.47;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o numero da Conta");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o numero da Agencia");
        String agencia = scanner.next();

        System.out.println("Digite o seu nome");
        String nomeCliente = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenomeCliente = scanner.next();

        System.out.println("Olá " + nomeCliente + " " + sobrenomeCliente);
        System.out.println("Obrigado por criar uma conta em nosso banco");
        System.out.println("Sua Agencia é: " + agencia + " Conta: " + numeroConta + " e seu saldo: " + saldo + "$" + " já está disponivel para saque");


        scanner.close();
    }
}
