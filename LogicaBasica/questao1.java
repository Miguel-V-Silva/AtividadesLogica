import java.util.Scanner;

public class questao1 {
    //Uma imobiliária vende apenas terrenos retangulares. Faça um programa para ler as dimensões de um terreno e depois exibir a área do terreno.
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a altura do terreno");
        float altura = input.nextFloat();
        System.out.println("Digite a largura do terreno");
        float largura = input.nextFloat();
        float area = altura * largura;
        System.out.println("A área do terreno é: " + area);
    }
}
