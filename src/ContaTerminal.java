import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception{

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner input = new Scanner(System.in);

        System.out.println("Por favor, digite o número da sua Conta! ");
        numero = input.nextInt();
        input.nextLine();

        System.out.println("Digite o número da sua agência! ");
        agencia = input.nextLine();

        System.out.println("Digite o seu nome completo! ");
        nomeCliente = input.nextLine();

        System.out.println("Digite o valor do saldo que deseja depositar! ");
        saldo = input.nextDouble();

        System.out.println("Olá " +nomeCliente+ ", obrigado por criar uma conta em nosso banco. Sua agência é " +agencia+ ", conta " +numero+ " e seu saldo de " +saldo+ "já está disponível para saque.");
         input.close();

        }
    }