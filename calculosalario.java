import java.util.Scanner;
public class calculosalario {
    public static void main(String[] args) {
        double idfun;
        float horastrab,pagporhora,salario;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero do funcionário");
        idfun = sc.nextDouble();
        System.out.println("Digite o numero de horas trabalhadas do funcionário");
        horastrab = sc.nextFloat();
        System.out.println("Digite o valor que o funcionário recebe por hora");
        pagporhora = sc.nextFloat();
        salario = horastrab*pagporhora;
        System.out.printf("O Valor a ser recebido pelo funcionário é de: %.2fx%.2f = %.2f",horastrab,pagporhora,salario);
        
        
    }
    
}
