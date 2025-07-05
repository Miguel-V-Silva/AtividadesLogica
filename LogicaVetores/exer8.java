import java.util.Scanner;

public class exer8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor(max.20)");
        int n = input.nextInt();

        double[] vet = new double[n];
        lerVetor(vet);

        double[] numerosNormais = new double[numeros(vet)];
        int[] repeticoes = new int[numeros(vet)];
        boolean repetiu;
        int a = -1;
        for (int i = 0; i < vet.length; i++) {
            repetiu = false;
            for (int j = 0; j < repeticoes.length; j++) {
                if (vet[i] == numerosNormais[j]) {
                    repetiu = true;
                }
            }

            if (!repetiu) {
                a++;
                numerosNormais[a] = vet[i];
                repeticoes[a] = repeat(vet[i], vet)+1;
            }
        }

        imprimirTabela(numerosNormais, repeticoes);

    }

    public static void lerVetor(double vet[]){
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < vet.length; i++) {
            System.out.println("Digite o "+(i+1)+"º valor do vetor");
            vet[i] = input.nextDouble();
        }
    }

    public static int numeros(double vet[]){
        int count = 0;
        for (int i = 0; i < vet.length; i++) {
                count += repeat(vet[i], vet);
        }
        count /= 2;
        
        return count;
    }

    public static int repeat(double vlr, double vet[]){
        int count = 0;
        for (int i = 0; i < vet.length; i++) {
                if (vet[i] == vlr) {
                    count++;
                }
        }

        return count-1;
    }

    public static void imprimirTabela(double[] valor, int[] frequencia){
        System.out.println("=========================");
        System.out.println("  VALOR     FRÊQUENCIA");
        for (int i = 0; i < valor.length; i++) {
            System.out.println("  "+valor[i]+"      "+frequencia[i]);
        }
        System.out.println("=========================");
   } 
}
