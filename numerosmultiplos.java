import java.util.Scanner;
public class areas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a;
        int b;

        System.out.println("Digite o primeiro número: ");
        a = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        b = sc.nextInt();

        if (a%b == 0 || b%a == 0){

           System.out.println("Os números são múltiplos");

        }

        else {

            System.out.println("Os números não são múltiplos");

        }

        sc.close();

    }
}
