import java.util.Scanner;

public class questao2 {
    // Uma loja de calçados está concedendo 12% de desconto nos produtos. Escreva um programa para calcular e exibir o valor de desconto a ser dado num par de sapatos e 
    //quanto deve custar o produto com o desconto. O preço do par de sapatos deve ser informado pelo usuário. Como resultado, o programa deverá exibir as seguintes mensagens:
    //O valor do desconto é de R$ xxx
    //O preço do par de sapatos com desconto é R$ xxx
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o preço do par de sapatos: ");
        float preco = input.nextFloat();
        float desconto = preco * 0.12f;
        float precoDesconto = preco - desconto;
        System.out.println("O valor do desconto é de R$ " + desconto);
        System.out.println("O preço do par de sapatos com desconto é R$ " + precoDesconto);
    }
}
