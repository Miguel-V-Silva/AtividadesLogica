import java.util.Scanner;

public class questao11 {
    //Descreva um programa que dado uma temperatura em °C informe o seu valor em °F. Fórmula:
    //°F = (9/5) °C + 32

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a temperatura em graus Celsius: ");
        double celsius = input.nextDouble();
        
        double fahrenheit = (9.0/5.0) * celsius + 32;

        System.out.println("A temperatura em graus Fahrenheit é: " + fahrenheit);
    }
}
