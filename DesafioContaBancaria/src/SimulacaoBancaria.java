import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;
        
        while (continuar) {
            System.out.println("Digite a opção desejada:");
            System.out.println(" 1.Depositar \n 2.Sacar \n 3.Consultar Saldo \n 0.Encerrar");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                    System.out.println("Digite o valor a ser depositado: ");
                    double deposito = scanner.nextDouble();
                    saldo += deposito;
                    System.out.println("Saldo atual: " + saldo);
                    
                    break;
                case 2:
                    // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                    System.out.println("Digite o valor a ser sacado: ");
                    double saque = scanner.nextDouble();
                    saldo -= saque;
                    if (saque > saldo){
                       System.out.println(" Saldo insuficiente ");

                    } else{
                        System.out.println("Saldo atual: " + saldo);
                    }
                      
                    break;
                case 3:
                    // TODO: Exibir o saldo atual da conta.
                    System.out.println("Saldo atual: " + saldo );
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}
