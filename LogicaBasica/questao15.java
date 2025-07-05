import java.util.Scanner;

public class questao15 {
    //Construa um programa para ler um número inteiro (assuma até 3 dígitos) e imprima a saída da seguinte forma:
    //X centena(s)  Y dezena(s) K unidade(s)  
    //Exemplo, se for submetido o número 384, o programa deverá exibir:
    //3 centena(s)  8 dezena(s) 4 unidade(s)  

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero de 3 digitos");
        int num = input.nextInt();
        
        int centena = num / 100;
        int dezena = (num % 100) / 10;
        int unidade = num % 10;
        System.out.println(centena+" centena(s) "+dezena+" dezena(s) "+unidade+" unidade(s)");
        
    }
}
