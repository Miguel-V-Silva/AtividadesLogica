import java.util.Scanner;

public class questao13 {
    //Numa loja de materiais de construção, um azulejo estampado custa R$ 12,50. Faça um programa para ler o comprimento e altura de uma parede (em metros), 
    //e depois escrever o valor gasto com a compra de azulejos. Considere que um metro quadrado é formado por 9 azulejos.

    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Digite a altura da parede: ");
        float altura = input.nextFloat();

        System.out.println("Digite a largura da parede: ");
        float largura = input.nextFloat();

        float area = altura * largura;
        float valorTotal = 12.5f *(area * 9);

        System.out.println("O valor final é R$"+valorTotal);
    }
}
