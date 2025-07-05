import java.util.Scanner;

public class exer7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor(max. 20)");
        int n = input.nextInt();
        while (n < 0 || n > 20) {
            System.out.println("Tamanho inválido. Tente novamente");
            n = input.nextInt();
        }

        int[] numeros = new int[n];
        lerVetor(numeros);
        System.out.println("================");
        exibirVetor(numeros);
        System.out.println();
        exibirVetor(ordernar(numeros));
        
    }

    public static void lerVetor(int vet[]){
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < vet.length; i++) {
            System.out.println("Digite o "+i+"º valor");
            int vlr = input.nextInt();
            while(autenticarValor(vet, vlr, i)) {
                System.out.println("O valor ja existe no vetor. Tente novamente");
                vlr = input.nextInt();
            }
            vet[i] = vlr;
        }
    }

    public static boolean autenticarValor(int vet[], int valor, int limt){
        for (int i = 0; i < limt; i++) {
            if (vet[i] == valor) {
                return true;
            }
        }
        return false;
    }

    public static int[] ordernar(int vet[]){
        int bolha;
        for (int i = 0; i < vet.length-1; i++) {
            if (vet[i] > vet[i+1]) {
                bolha = vet[i];
                vet[i] = vet[i+1];
                vet[i+1] = bolha;
                i=0;
            }
        }
        return vet;
    }

    public static void exibirVetor(int vet[]){
        for (int i = 0; i < vet.length; i++) {
            System.out.print("["+vet[i]+"]");
        }
    }
}
