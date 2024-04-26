import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Conhecer e importar a classe Scanner
        Locale.setDefault(Locale.ENGLISH);
        Scanner scanner = new Scanner(System.in);

        Conta conta = new Conta();

        //Exibir as mensagens para o nosso usuário

        System.out.println("Por favor digite o número da agência: ");
        conta.setNumero(scanner.nextInt());

        scanner.nextLine();

        System.out.println("Por favor digite a agência: ");
        conta.setAgencia(scanner.nextLine());

        System.out.println("Por favor digite o seu nome: ");
        conta.setNomeCliente(scanner.nextLine());

        System.out.println("Por favor digite o saldo: ");
        conta.setSaldo(scanner.nextFloat());


        //Exibir a mensagem conta criada
        System.out.println("Conta criada!");
        System.out.println();
        System.out.println(conta);

    }
}
