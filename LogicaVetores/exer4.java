import java.util.Scanner;

public class exer4 {
    public static void main(String[] args) {
        int[] vetor1 = new int[3];
        int[] vetor2 = new int[3];
        int[] soma = new int[3];

        lerVetor(vetor1);
        lerVetor(vetor2);
        somarVetores(vetor1, vetor2, soma);
        System.out.println("=======================");
        exibirVetor(vetor1);
        exibirVetor(vetor2);
        System.out.println("===========SOMA========");
        exibirVetor(soma);
        
    }

    public static void lerVetor(int vet[]){
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < vet.length; i++) {
            System.out.println("Digite o "+i+"º valor");
            vet[i] = input.nextInt();
        }
    }

    public static void somarVetores(int vet1[], int vet2[], int soma[]){
        for (int i = 0; i < vet2.length; i++) {
            soma[i] = vet1[i] + vet2[i];
        }
    }

    public static void exibirVetor(int vet[]){
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i]+"; ");
        }
        System.out.println();
    }
}
