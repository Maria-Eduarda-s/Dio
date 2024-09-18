package clarojavacomspringboot.contabanco;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Conta conta = new Conta();
        conta.InserirDados(sc);

        sc.close();
    }
}

class Conta{

    public int numero;
    public String agencia;
    public String nomeCliente;
    public double saldo;


    public void InserirDados(Scanner sc){

        System.out.println("Por favor, digite o número da Agência !");
        agencia = sc.nextLine();

        System.out.println("Por favor, digite o número da conta !");
        numero = sc.nextInt();
        sc.nextLine();

        System.out.println("Por favor, digite o nome do cliente !");
        nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o saldo !");
        saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}