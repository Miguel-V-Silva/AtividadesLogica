import java.util.Scanner;

public class questao16 {
    //Suponha que um caixa disponha apenas de notas de 100, 10 e 1 reais. Considerando que alguém está pagando uma compra, faça um programa que determine 
    //e escreva o número mínimo de notas que o caixa deve fornecer como troco. 
    //Escreva também o número de cada tipo de nota a ser fornecido como troco. Suponha que o sistema monetário não utilize centavos.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor do produto: ");
        float valorProduto = input.nextFloat();

        System.out.println("Digite o valor pago: ");
        float valorPago = input.nextFloat();

        float troco = valorPago - valorProduto;
        int notas100 = 0, notas10 = 0, notas1 = 0;

        while (troco != 0) {
            if (troco >= 100) {
                troco -= 100;
                notas100++;
            }else if (troco >= 10) {
                troco -= 10;
                notas10++;
            }else{
                troco -= 1;
                notas1++;
            }
        }

        System.out.println("O número mínimo de notas de troco é: "+(notas1 + notas10 + notas100));
        System.out.println("Quantidade de notas de 100 necessárias é: "+notas100);
        System.out.println("Quantidade de notas de 10 necessárias é: "+notas10);
        System.out.println("Quantidade de notas de 1 necessárias é: "+notas1);
    }
}
