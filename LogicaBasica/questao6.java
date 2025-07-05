import java.util.Scanner;

public class questao6 {
    //Um restaurante cobra R$ 25,00 por cada quilo de refeição. 
    //Escreva um programa que leia o peso do prato montado pelo cliente (em quilos) e imprima o valor a pagar. O peso do prato é de 750 gramas.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o peso do prato em quilos: ");
        double peso = input.nextDouble();
        peso -= 0.75;

        double valor = peso * 25;
        System.out.println("O valor do prato do cliente é R$ " + valor);
    }

}
