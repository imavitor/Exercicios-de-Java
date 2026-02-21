import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        System.out.println("Digite a Senha:");
        Scanner sc = new Scanner(System.in);
        int senha = sc.nextInt();


        while (senha != 2002){
            
            System.out.println("Senha inválida!");
            System.out.println("Digite a Senha:");
            senha = sc.nextInt();

        }

        System.out.println("Acesso Permitido");
        sc.close();

    }

}
