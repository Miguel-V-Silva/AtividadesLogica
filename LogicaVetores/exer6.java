import java.util.Scanner;

public class exer6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o tamnho do vetor");
        int n = input.nextInt();
        double[] reais = new double[n];
        
        lerVetor(reais);
        System.out.println("Digite um valor para encontrar no vetor");
        double vlr = input.nextDouble();

        if (encontrarValor(reais, vlr)) {
            System.out.println("O valor existe no vetor");
        }else{
            System.out.println("Nenhum valor encontrado");
        }

    }

    public static void lerVetor(double vet[]){
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < vet.length; i++) {
            System.out.println("Digite o "+i+"º valor");
            vet[i] = input.nextDouble();
        }
    }

    public static boolean encontrarValor(double vet[], double vlr){
        for (int i = 0; i < vet.length; i++) {
            if (vlr == vet[i]) {
                return true;
            }
        }
        return false;
    }

}
