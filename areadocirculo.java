import java.util.Scanner;

public class Areadocirculo{
public static void main(String[] args){
    double r, area;
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o valor do Raio: ");
    r = sc.nextDouble();
    area = 3.14159*r*r;
System.out.println("O valor da área é: " + area);
        }
    }
