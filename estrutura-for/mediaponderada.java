import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos testes serão feitos?");
        int teste = sc.nextInt();
        float n1,n2,n3, media = 0;
        int i, t = 0;

        for (i = 1; i <= teste; i++){

            System.out.println("Teste " + i +": ");
            System.out.println("Digite o primeiro número: ");
            n1 = sc.nextFloat();
            System.out.println("Digite o segundo número: ");
            n2 = sc.nextFloat();
            System.out.println("Digite o terceiro número: ");
            n3 = sc.nextFloat();

            media = (n1*1 + n2*2 + n3*3)/6;

            System.out.println("Resultado do " + i + "º teste: ");
            System.out.println(media);

            }

        sc.close();

        }

    }
