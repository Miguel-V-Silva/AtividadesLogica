import java.util.Scanner;

public class questao7 {
    //Uma fábrica de refrigerantes vende seu produto em três formatos: lata de 350 ml, garrafa de 600 ml e garrafa de 2 litros. 
    //Se um comerciante compra uma determinada quantidade de cada formato, faça um programa para calcular quantos litros de refrigerante ele comprou.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Quantidade de lata de 350ml: ");
        int lata = input.nextInt();
        System.out.println("Quantidade de garrafa de 600ml: ");
        int garrafa600 = input.nextInt();
        System.out.println("Quantidade de garrafa de 2 litros: ");
        int garrafa2litros = input.nextInt();

        double litros = (lata * 0.35) + (garrafa600 * 0.6) + (garrafa2litros * 2);

        System.out.println("O cliente comprou ao total "+litros+" litros");
    }
}
