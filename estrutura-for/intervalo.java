import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos números serão digitados?");
        int x = sc.nextInt();
        int i = 1;
        int in = 0;
        int out = 0;
        for (i=1; i<=x; i++){

            Scanner num = new Scanner(System.in);
            System.out.println("Número " + i +":");
            int numero = num.nextInt();

            if (numero >=10 && numero <= 20){

                in+=1;

            }
            else{
                out +=1;
            }

        }

        System.out.println(in + " in\n");
        System.out.println(out + " out");

    }
}
