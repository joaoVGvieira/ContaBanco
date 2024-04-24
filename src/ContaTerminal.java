import java.util.Scanner;

public class ContaTerminal {


    static Scanner Entrada = new Scanner(System.in);

    static int Numero;

    static String Agencia;

    static String NomeCliente;

    static float Saldo;


    
    public static void main(String[] args) {
        System.out.println("Qual o numero da conta:");
        Numero = Integer.parseInt(Entrada.nextLine());
        System.out.println("Qual o numero da Agencia:");
        Agencia = Entrada.nextLine();
        System.out.println("Qual o seu nome:");
        NomeCliente = Entrada.nextLine();
        System.out.println("Qual o seu Saldo:");
        Saldo = Float.parseFloat(Entrada.nextLine());

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s , conta %d e seu saldo %f já está disponível para saque",NomeCliente,Agencia,Numero,Saldo);

    }
}
