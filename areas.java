import java.util.Scanner;
public class areas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a,b,c,triangulo,circulo,trapezio,quadrado,retangulo;
        System.out.println("Digite os valores para A, B e C: ");
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        triangulo = (a*c)/2;
        circulo = (float)3.14159*c*c;
        trapezio = ((a+b)*c)/2;
        quadrado = b*b;
        retangulo = a*b;
        System.out.printf("Triangulo: %.2f\n Circulo: %.2f\n Trapézio: %.2f\n Quadrado: %.2f\n Retângulo %.2f\n",triangulo,circulo,trapezio,quadrado,retangulo);
        sc.close();

    }
    
}
