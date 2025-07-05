import java.util.Scanner;

public class exer10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean parar = false;
        int[] vet = new int[0];
        int numCasa = 0;

        while (!parar) {
            switch (menu()) {
                case 1:
                    System.out.println("Digite um Valor a ser insirido");
                    int valor = input.nextInt();
                    while (verificaValor(vet, valor)) {
                        System.out.println("O Valor já é exitente no vetor, tente novamente");
                        valor = input.nextInt();
                    }
                    vet = inserirValor(vet, numCasa, valor);
                    numCasa++;
                    System.out.println("Valor Inserido com sucesso");
                    break;
                
                case 2:
                    System.out.println("Digite o Valor a ser pesquisado");
                    valor = input.nextInt();
                    if (verificaValor(vet, valor)) {
                        System.out.println("O valor EXISTE no vetor!!!");
                    }else{
                        System.out.println("O valor NÃO existe no vetor");
                    }
                    break;    
                
                case 3:
                    System.out.println("Digite o antigo valor");
                    valor = input.nextInt();
                    if (!verificaValor(vet, valor)) {
                        System.out.println("O valor não existe no vetor");
                        break;
                    }
                    System.out.println("Digite o novo valor");
                    int novoValor = input.nextInt();
                    vet = alterarValor(vet, valor, novoValor);
                    System.out.println("Valor Alterado com sucesso");
                    break;
                
                case 4:
                    System.out.println("Digite o valor a ser Excluido");
                    valor = input.nextInt();
                    if (!verificaValor(vet, valor)) {
                        System.out.println("O valor não existe no vetor");
                        break;
                    }
                    vet = excluirValor(vet, valor);
                    System.out.println("Valor Excluido com sucesso");
                    break;
                
                case 5:
                    for (int i = 0; i < vet.length; i++) {
                        System.out.print("["+vet[i]+"]");
                    }
                    System.out.println();
                    break;
                
                case 6:
                    vet = ordernar(vet);
                    System.out.println("Vetor Ordenado");
                    break;
                
                case 7:
                    vet = inverter(vet);
                    System.out.println("Vetor Invertido");
                    break;
                
                case 8:
                    System.out.println("Saindo do Programa!!");
                    parar = true;
                    break;
                default:
                    break;
            }
        }


    }

    public static int menu(){
        Scanner input = new Scanner(System.in);

        System.out.println("====DIGITE=UMA=OPÇÃO====");
        System.out.println("1-Incluir Valor");
        System.out.println("2-Pesquisar Valor");
        System.out.println("3-Alterar Valor");
        System.out.println("4-Excluir Valor");
        System.out.println("5-Mostrar Valores");
        System.out.println("6-Ordenar Valores");
        System.out.println("7-Inverter Valores");
        System.out.println("8-Sair");
        System.out.println("========================");

        int opcao = input.nextInt();
        
        while (opcao<1 || opcao>8){
            System.out.println("Digite uma opção válida");
            opcao = input.nextInt();
        }
        return opcao;
    }

    public static boolean verificaValor(int[] vet, int vlr){
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] == vlr) {
                return true;
            }    
        }
        return false;
    }

    public static int[] inserirValor(int[] vet, int qtd, int vlr){
        int[] novoVet = new int[qtd+1];
        for (int i = 0; i < qtd; i++) {
            novoVet[i] = vet[i];
        }
        novoVet[qtd] = vlr;
        vet = novoVet;
        return vet;
    }

    public static int[] alterarValor(int[] vet, int valorAntigo, int valorNovo){
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] == valorAntigo) {
                vet[i] = valorNovo;
                break;
            }
        }

        return vet;
    }

    public static int[] excluirValor(int[] vet, int vlr){
        int[] novoVet = new int[vet.length-1];
        int j=0;
        for (int i = 0; i < novoVet.length; i++) {
           if (vet[i] != vlr) {
            novoVet[j] = vet[i];
            j++;
           }
        }
        vet = novoVet;
        return vet;
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

    public static int[] inverter(int[] vet){
        int[] novoVet = new int[vet.length];
        int j = 0;
        for (int i = vet.length-1; i >= 0; i--) {
            novoVet[j] = vet[i];
            j++;
        }
        return novoVet;

    }
}
