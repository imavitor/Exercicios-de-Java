import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a Primeira coordenada:");
        int x = sc.nextInt();
        System.out.println("Digite a Segunda coordenada:");
        int y = sc.nextInt();


        while (x != 0 && y != 0){

            if (x > 0.0 && y > 0.0) {
                System.out.println("Primeiro");
            }
            else if (x < 0.0 && y > 0.0) {
                System.out.println("Segundo");
            }
            else if (x < 0.0 && y < 0.0) {
                System.out.println("Terceiro");
            }

            else {
                System.out.println("Quarto");
            }

            System.out.println("Digite a Primeira coordenada:");
            x = sc.nextInt();
            System.out.println("Digite a Segunda coordenada:");
            y = sc.nextInt();

        }

        sc.close();

    }

}
