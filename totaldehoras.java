import java.util.Scanner;
public class areas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a;
        int b;

        System.out.println("Digite a hora de início do jogo: ");
        a = sc.nextInt();
        System.out.println("Digite a hora de fim do jogo: ");
        b = sc.nextInt();
        int total;
        if (a == b){

           System.out.println("O jogo durou 24 horas");

        }

        else if (a > b){

            total = 24+b - a;
            System.out.printf("O jogo durou %d horas", total);

        }

        else {
            total = b - a;
            System.out.printf("O jogo durou %d horas", total);
        }

        sc.close();

    }
}
