import java.util.Scanner;

public class questao14 {
    //Descreva um programa que a partir da distância percorrida e o do tempo gasto por um motorista durante uma viagem de final de semana, 
    //calcule a velocidade média e a quantidade de combustível gasto na viagem, sabendo que o automóvel faz 12 km por litro.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Distância percorrida: ");
        float distancia = input.nextFloat();

        System.out.println("Tempo gasto: ");
        float tempo = input.nextFloat();

        float velocidade = distancia / tempo;
        float combustivel = distancia / 12;

        System.out.println("A velocidade média foi de "+velocidade+" km/h e a quantidade de combustível usado foi "+combustivel+" litros.");

    }
}
