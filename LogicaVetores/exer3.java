import java.util.Scanner;

public class exer3 {
    public static void main(String[] args) {
        double[] reais = new double[3];
        lerVetor(reais);
        aumentarImparesPares(reais);
        exibirVetor(reais);
    }

    public static void lerVetor(double vet[]){
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < vet.length; i++) {
            System.out.println("Digite o "+i+"º valor");
            vet[i] = input.nextDouble();
        }
    }

    public static void aumentarImparesPares(double vet[]){
        for (int i = 0; i < vet.length; i++) {
            if (i % 2 == 0) {
                vet[i] += vet[i] * 0.05;
            }else{
                vet[i] += vet[i] * 0.02;
            }
        }
    }

    public static void exibirVetor(double vet[]){
        for (int i = 0; i < vet.length; i++) {
            System.out.println(vet[i]);
        }
    }
}
