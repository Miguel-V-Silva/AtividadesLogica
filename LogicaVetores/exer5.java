import java.util.Scanner;

public class exer5 {
    public static void main(String[] args) {
        String[] perguntas = {"Gosta de música sertaneja?", "Gosta de futebol?", "Gosta de seriados?", "Gosta de redes sociais?", "Gosta da Oktoberfest?"};
        String[] rapaz = new String[5];
        String[] moca = new String[5];

        lerRespostas(moca, perguntas);
        lerRespostas(rapaz, perguntas);
        System.out.println("Afinidade: "+calcularAfinidade(rapaz, moca));
        resultadoAfinidade(calcularAfinidade(rapaz, moca));

    }

    public static void lerRespostas(String vet[], String perguntas[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Responda as perguntas com sim, nao e ind(indiferente)");
        for (int i = 0; i < perguntas.length; i++) {
            System.out.println(perguntas[i]);
            vet[i] = input.next().toLowerCase();
            while (!vet[i].equals("sim") && !vet[i].equals("nao") && !vet[i].equals("ind")) {
                System.out.println("Resposta Inválida. Tente Novamente");
                vet[i] = input.next().toLowerCase();
            } 
        }
    }

    public static int calcularAfinidade(String vet1[], String vet2[]){
        int afinidade = 0;

        for (int i = 0; i < vet1.length; i++) {
            if (vet1[i].equals(vet2[i])) {
                afinidade += 3;
            }else if (vet1[i].equals("ind") || vet2[i].equals("ind")) {
                afinidade++;
            }else{
                afinidade -= 2;
            }
        }

        return afinidade;
    }

    public static void resultadoAfinidade(int num){
        if (num == 15) {
            System.out.println("Casem");
        }else if (num >= 10 && num <= 14) {
            System.out.println("Vocês têm muita coisa em comum!");
        }else if (num >=5 && num <= 9) {
            System.out.println("Talvez não dê certo :(");
        }else if(num >= 0 && num <= 4){
            System.out.println("Vale um encontro.");
        }else if(num <= -1 && num >= -9){
            System.out.println("Melhor não perder tempo");
        }else{
            System.out.println("Vocês se odeiam!");
        }
    }
}
