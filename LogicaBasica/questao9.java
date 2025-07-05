import java.util.Scanner;

public class questao9 {
    //Descreva um programa que calcule o volume de uma lata de óleo. Fórmula:
    //V = (π * r^2 * h)

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o raio da lata de óleo: ");
        double raio = input.nextDouble();
        System.out.println("Digite a altura da lata de óleo: ");
        double altura = input.nextDouble();
        double volume = (Math.PI * Math.pow(raio, 2) * altura);
        System.out.println("O volume da lata de óleo é: " + volume);
    }
}
