import java.util.Scanner;
public class pagamentodepeca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cdpeca1,cdpeca2,n1pecas,n2pecas,v1peca,v2peca,total;
        System.out.println("Digite o código da peça 1: ");
        cdpeca1 = sc.nextDouble();
        System.out.println("Digite o quantitativo da peça 1: ");
        n1pecas = sc.nextDouble();
        System.out.println("Digite o valor unitário da peça 1: ");
        v1peca = sc.nextDouble();
        System.out.println("Digite o código da peça 2: ");
        cdpeca2 = sc.nextDouble();
        System.out.println("Digite o quantitativo da peça 2: ");
        n2pecas = sc.nextDouble();
        System.out.println("Digite o valor unitário da peça 2: ");
        v2peca = sc.nextDouble();
        total = (v1peca*n1pecas)+(v2peca*n2pecas);
        System.out.println("O total foi de: " + total);
        sc.close();

    }

}
