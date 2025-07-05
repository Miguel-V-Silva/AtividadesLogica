import java.util.Scanner;

public class questao10 {
    //Descreva um programa que leia o comprimento dos catetos de um triângulo retângulo e calcule o comprimento da hipotenusa.
    //Fórmula: hipotenusa² = cateto1² + cateto2²

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o valor do cateto oposto: ");
        double catetoOposto = input.nextDouble();
        
        System.out.println("Digite o valor do cateto adjacente: ");
        double catetoAdjacente = input.nextDouble();
        
        double hipotenusa = Math.sqrt(Math.pow(catetoOposto, 2) + Math.pow(catetoAdjacente, 2));
        
        System.out.println("O valor da hipotenusa é: " + hipotenusa);
    }


}
