import java.util.Scanner;

public class questao4 {
    //Faça um programa para ler três notas de um aluno em uma disciplina e imprimira sua média ponderada (as notas tem pesos respectivos de 5, 3 e 2).
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite a primeira nota: ");
        double nota1 = input.nextDouble();
        
        System.out.println("Digite a segunda nota: ");
        double nota2 = input.nextDouble();
        
        System.out.println("Digite a terceira nota: ");
        double nota3 = input.nextDouble();
        
        double media = (nota1 * 5 + nota2 * 3 + nota3 * 2) / 10;

        System.out.println("A média ponderada é: " + media);
    }
}
