import java.util.Scanner;

public class exer9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Entre com o número de pesquisados: ");
        int number = verificaValor(input.nextInt(), 0, 30);

        int[][] pesquisa = new int[number][3];
        int masc=0, coutNotas=0, coutNotasHomem=0;
        int idadeNova=0, notaMaisNova=0;
        
    
        for (int i = 0; i < pesquisa.length; i++) {
            System.out.println("Digite o sexo da "+i+"ª pessoa(1=Mesculino; 2=Feminino)");
            pesquisa[i][0] = verificaValor(input.nextInt(), 1, 2);
            
            System.out.println("Digite uma nota para o cinema(de 0 a 10)");
            pesquisa[i][1] = verificaValor(input.nextInt(), 0, 10);
            coutNotas += pesquisa[i][1];

            System.out.println("Digite a idade da "+i+"ª pessoa");
            pesquisa[i][2] = input.nextInt();

            if (i != 0) {
                if (pesquisa[(i-1)][0] == 1 && pesquisa[i][0] == 2 && idadeNova == 0) {
                idadeNova = pesquisa[i][0];
            }
            }

            if (pesquisa[i][0] < idadeNova) {
                idadeNova = pesquisa[i][0];
                notaMaisNova = pesquisa[i][2];
            }

            if (pesquisa[i][0] == 1) {
                coutNotasHomem += pesquisa[i][0];
                masc++;
            }
        }
    
        System.out.println("A média das notas é de: "+(coutNotas/number));
        System.out.println("A média das notas dos homens é de: "+(coutNotasHomem/masc));
        System.out.println("A nota da mulher mais nova é de: "+notaMaisNova);
        System.out.println("Número de mulher acima de 50 anos que deram nota superior a média: "+mulherAcima((coutNotas/number), 50, pesquisa));
    }

    public static int verificaValor(int vlr, int min, int max){
        Scanner input = new Scanner(System.in);
        while (vlr < min || vlr > max) {
            System.out.println("Digite um valor válido");
            vlr = input.nextInt();
        }

        return vlr;
    }

    public static int mulherAcima(double media, int idade, int[][] matriz){
        int mulherAcima=0;
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][1] > media && matriz[i][0] > idade) {
                mulherAcima++;
            }
        }
        return mulherAcima;
    } 
}
