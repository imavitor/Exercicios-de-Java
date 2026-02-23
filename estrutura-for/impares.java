import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 1000: ");
        int x = sc.nextInt();
        int i = 1;
        for (i=1; i<x; i++){

            if (i%2 != 0){

                System.out.println(i);

            }

        }
    }
}
