import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas divisões serão feitas?");
        int N = sc.nextInt();
        int i = 0;
        float n1,n2, divisao = 0;

        for (i = 1; i <= N; i++){

            System.out.println("Digite o primeiro número: ");
            n1 = sc.nextFloat();
            System.out.println("Digite o segundo número: ");
            n2 = sc.nextFloat();
            divisao = n1/n2;

            if (n2 == 0){

                System.out.println("Divisão impossível");

            }

            else {

            System.out.println("Resultado da " + i + "º divisão: " + divisao);

            }
        }

        sc.close();

        }

    }
