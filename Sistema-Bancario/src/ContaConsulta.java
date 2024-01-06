import java.util.Scanner;

public class ContaConsulta {

    public static void main(String[] args) throws Exception {

        /// Recebendo valores
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu nome :");
        String nome = scanner.next();
        System.out.println("Digite o número de identificação:");
        String numero = scanner.next();
        System.out.println("Digite sua agência:");
        String agencia = scanner.next();
        System.out.println("Digite seu saldo:");
        double saldo = scanner.nextDouble();

        /// Imprimindo dados
        System.out.println("Olá" + nome + ", Seu registro é " + numero + "-" + agencia + " e seu saldo é: " + saldo);

        /// manipulando valor da conta
        int status = 30;
        while (status != 0) { /// 0 como condição para terminar o loop
            System.out.println("Digite 0 para terminar a sessão | 1 para sacar | 2 para inserir");
            status = scanner.nextInt();

            if (status == 1) { /// Condição para sacar
                System.out.println("Insira o valor que deseja sacar : ");
                double valor = scanner.nextDouble();
                saldo = saldo - valor;
            } else if (status == 2) { /// Condição para inserir
                System.out.println("Insira o valor que deseja inserir : ");
                double valor = scanner.nextDouble();
                saldo = saldo + valor;
            }
            /// Imprimindo status final da conta
            System.out.println("Olá" + nome + ", Seu registro é " + numero + "-" + agencia + " e seu saldo é: " + saldo);

        }

        scanner.close();
    }

}