import java.util.Scanner;

public class exer2 {
    public static void main(String[] args) {
        double[] reais = new double[3];
        lerVetor(reais);
        System.out.println("=========NUMEROS ACIMA DA MEDIA========");
        acimaMedia(reais, calcularMediaVetor(reais));
    }

    public static void lerVetor(double vet[]){
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < vet.length; i++) {
            System.out.println("Digite o "+i+"º valor");
            vet[i] = input.nextDouble();
        }
    }

    public static double calcularMediaVetor(double vet[]){
        double count = 0.0;
        for (int i = 0; i < vet.length; i++) {
            count += vet[i];
        }

        return count/vet.length;
    }

    public static void acimaMedia(double vet[], double media){
        for (int i = 0; i < vet.length; i++) {
            if (vet[i]> media) {
                System.out.println(vet[i]);
            }
        }
    }
}
