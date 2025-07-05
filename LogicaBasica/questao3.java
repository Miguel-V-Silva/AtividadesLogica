import java.util.Scanner;

public class questao3 {
    //Um motorista deseja abastecer seu tanque de combustível. 
    //Escreva um programa para ler o preço do litro da gasolina e o valor do pagamento e exibir quantos litros ele conseguiu colocar no tanque.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Preço do litro da gasolina: ");
        double precoLitro = input.nextDouble();
        System.out.println("Valor do pagamento: ");
        double valorPagamento = input.nextDouble();
        double litrosAbastecidos = valorPagamento / precoLitro;
        System.out.println("Litros abastecidos: " + litrosAbastecidos);

    }
}
