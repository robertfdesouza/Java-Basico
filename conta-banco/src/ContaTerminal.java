import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner ler = new Scanner(System.in);

        int numAgencia;
        System.out.println("Olá! Seja bem-vindo Cliente!");
        System.out.println("Digite o Número da sua Agência: ");
        numAgencia = ler.nextInt();
        System.out.println("O Número da sua Agência é: " + numAgencia);

        String nomAgencia;
        System.out.println("Digite o Nome da Agência:  ");
        nomAgencia = ler.next();
        System.out.println("O Nome da sua Agência é: " + nomAgencia);

        String nomCliente;
        System.out.println("Digite o Nome do Cliente:  ");
        nomCliente = ler.next();
        System.out.println("O Seu nome é: " + nomCliente);

        double saldoConta;
        System.out.println("Digite o seu Saldo:  ");
        saldoConta = ler.nextDouble();
        System.out.println("O Seu saldo é: R$ " + saldoConta);

        System.out.println("Olá " + nomCliente + 
        ", obrigado por criar uma conta em nosso banco, sua agência é a " + nomAgencia + 
        " Conta " + numAgencia + " e o seu saldo é: " + saldoConta + " já está disponivel para saque.");


    }
}
