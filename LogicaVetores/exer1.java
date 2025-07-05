import java.util.Scanner;

public class exer1 {
    
    public static void main(String[] args) {
        int[] numeros = new int[3];
        lerVetor(numeros);
        System.out.println("a");
        inverterVetor(numeros);
    }

    public static void lerVetor(int vet[]){
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < vet.length; i++) {
            System.out.println("Digite o "+i+"º número");
            vet[i] = input.nextInt();
        }
        input.close();
    }

    public static void inverterVetor(int vet[]){
        for (int i = vet.length - 1; i >= 0; i--) {
            System.out.println(vet[i]);
        }
    }
}
