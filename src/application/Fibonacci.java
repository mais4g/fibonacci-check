package application;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
            int numberToCheck = scanner.nextInt();

            if (isFibonacci(numberToCheck)) {
                System.out.println(numberToCheck + " pertence à sequência de Fibonacci.");
            } else {
                System.out.println(numberToCheck + " não pertence à sequência de Fibonacci.");
            }

            System.out.println("Pressione Enter para fazer outra consulta ou digite 'sair' para fechar o programa:");
            scanner.nextLine(); 
            String entrada = scanner.nextLine();
            if (entrada.equalsIgnoreCase("sair")) {
                continuar = false;
            }
        }

        System.out.println("Programa encerrado.");
        scanner.close();
    }

    public static boolean isFibonacci(int number) {
        int prev = 0;
        int next = 1;
        if (number == prev || number == next) {
            return true;
        }
        int sum = prev + next;
        while (sum <= number) {
            if (sum == number) {
                return true;
            }
            prev = next;
            next = sum;
            sum = prev + next;
        }
        return false;
    }
}



