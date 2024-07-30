import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //TODO:Declaração das variáveis
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        //TODO: Criação de um objeto Scanner para leitura de dados do terminal
        Scanner scanner = new Scanner(System.in);

        //TODO: Solicitando e lendo os dados do usuário
        System.out.println("Por favor, digite o número da Conta!");
        numero = scanner.nextInt();

        //TODO: Limpa o buffer do scanner
        scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência!");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o seu Nome!");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o Saldo!");
        saldo = scanner.nextDouble();

        //TODO: Fechando o objeto Scanner
        scanner.close();

        //TODO: Exibição da mensagem final
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";

        System.out.println(mensagem);
    }
}
