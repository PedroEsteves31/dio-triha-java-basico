import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        double saldo = 0;

        System.out.println("Por favor, digite o seu nome:");
        String nomeCliente = scan.nextLine();

        System.out.println("Por favor, insira o número da agência");
        String agencia = scan.nextLine();

        System.out.println("Por favor, insira o número da conta:");
        int numero = scan.nextInt();

        System.out.println(
                "Olá " +nomeCliente + ", obrigado por criar uma conta" +
                "em nosso banco, sua agência é " + agencia + ", conta " + numero +
                " e seu saldo (+" + saldo + ") já está disponível para saque");
    }

}
