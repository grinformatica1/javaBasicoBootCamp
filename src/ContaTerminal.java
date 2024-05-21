import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception{

//        int numero = 1021;
//        String agencia = "067-8";
//        String nomeCLiente = "MARIO ANDRADE";
//        double saldo = 237.48;

        Scanner input = new Scanner(System.in);

        System.out.print("Por favor, digite o número da Agência! ");
        int numero = input.nextInt();

        System.out.print("Digite o número da sua conta! ");
        String agencia = input.nextLine();

        System.out.print("Digite o seu nome completo! ");
        String nomeCliente = input.nextLine();

        System.out.print("Digite o valor do saldo que deseja depositar! ");
        double saldo = input.nextDouble();


         System.out.println("Olá " +nomeCliente+ ", obrigado por criar uma conta em nosso banco. sua agência é " +agencia+ ", conta " +numero+ " e seu saldo " +saldo+ "já está disponível para saque.");
        }
    }