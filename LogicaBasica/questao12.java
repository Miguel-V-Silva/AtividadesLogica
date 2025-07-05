import java.util.Scanner;

public class questao12 {
    //Uma empresa tem para um funcionário os seguintes dados: o nome, o número de horas trabalhadas mensais e o número de dependentes. 
    //A empresa paga R$ 10,00 por hora (valor para cálculo do salário trabalho) e R$ 60,00 por dependente (valor para cálculo do salário família) e são feitos descontos de 8,5% sobre o salário trabalho para o INSS
    //e de 5% sobre o salário trabalho para o imposto de renda. 
    //Descreva um programa que informe o nome, o salário bruto e o salário líquido do funcionário.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o nome do funcionário: ");
        String nome = input.nextLine();
        
        System.out.println("Digite o número de horas trabalhadas mensais: ");
        double horasTrabalhadas = input.nextDouble();
        
        System.out.println("Digite o número de dependentes: ");
        double dependentes = input.nextDouble();
        
        double salarioBruto = (horasTrabalhadas * 10) + (dependentes * 60);
        double salarioLiquido = salarioBruto - ((horasTrabalhadas * 10) * 0.085) - ((horasTrabalhadas * 10) * 0.05);

        System.out.println("O funcionário"+ nome +"possui um salário bruto de R$"+salarioBruto+" e um salário líquido de R$"+salarioLiquido);

    }
}
