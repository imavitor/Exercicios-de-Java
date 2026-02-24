import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = sc.nextInt();
        int i = 0;

            for (i = 1; i <= num; i++) {

                if (num % i == 0){

                    System.out.println(i);

                }

            }
            sc.close();
        }

    }




