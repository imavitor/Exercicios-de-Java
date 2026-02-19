import java.util.Scanner;
public class areas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int code;
        double price = 0;
        int quant;
        double total = 0;

        System.out.println("Digite o código do produto de 1 a 5: ");
        code = sc.nextInt();
        System.out.println("Digite a quantidade do produto: ");
        quant = sc.nextInt();


        if (code == 1 ){

           price = 4.00;

        }

        else if (code == 2){

            price = 4.50;

        }

        else if (code == 3){

            price = 5.00;

        }

        else if (code == 4){

            price = 2.00;

        }

        else if (code == 5){

            price = 1.50;

        }

        total = quant*price;

        System.out.printf("O total deu: %.2f", total);

        sc.close();

    }
}
