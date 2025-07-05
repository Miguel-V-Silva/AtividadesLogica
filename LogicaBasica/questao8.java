import java.util.Scanner;

public class questao8 {
    //Uma pessoa foi até uma casa de câmbio trocar dólares por reais. Para isto ela entregou um valor em dólares para o atendente. 
    //Considerando que o atendente tem a cotação do dólar, descreva um programa para calcular quantos reais o atendente deve devolver para a pessoa.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite quantos dolares você deseja trocar: ");
        float dolares = input.nextFloat();

        float reais = dolares * 5.65f;

        System.out.println("O atendente deve devolver R$"+reais+" para o cliente");
    }
}
