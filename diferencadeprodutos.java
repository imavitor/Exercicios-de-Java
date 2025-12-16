import java.util.Scanner;

public class diferencadeprodutos{
    public static void main(String[] args) {
        int A,B,C,D,diferenca;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os valores de ABC e D: ");
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();
        diferenca = ((A*B)-(C*D));
        System.out.printf("O valor de (%d*%d)-(%d*%d) é igual a %d",A,B,C,D,diferenca);
        
        sc.close();
    }

}

