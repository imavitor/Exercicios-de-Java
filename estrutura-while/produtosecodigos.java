import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o código desejado:\n 1.Álcool\n 2.Gasolina\n 3.Diesel\n 4.Fim\n");
        int codigo = sc.nextInt();
        int Alcool = 0;
        int Gasolina = 0;
        int Diesel = 0;
        String combustível = " ";


        while (codigo != 4) {

            if (codigo == 1) {
                Alcool += 1;
            }

            else if (codigo == 2) {
                Gasolina += 1;
            }
            else if (codigo == 3) {
                Diesel += 1;
            }
            else if (codigo < 1 || codigo > 4){
                System.out.println("Digite um código válido!\n");
            }
            System.out.println("Digite o código desejado:\n 1.Álcool\n 2.Gasolina\n 3.Diesel\n 4.Fim\n");
            codigo = sc.nextInt();
        }

        System.out.println("MUITO OBRIGADO");
        System.out.printf("1.Álcool: %d\n 2.Gasolina: %d\n 3.Diesel: %d\n", Alcool, Gasolina, Diesel);
        sc.close();

    }

}
