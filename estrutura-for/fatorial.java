import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = sc.nextInt();
        int i = 0;
        int fatorial = num;

        if (num == 0){

            fatorial = 1;

        }

        for (i = 1; i < num; i++) {


            fatorial = fatorial*(num-i);

        }
        System.out.println(fatorial);
        sc.close();
    }

}



