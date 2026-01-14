import java.io.IOException;
import java.util.Scanner;

class Main {

    public static void main(String[] args) throws IOException {

        // lê entradas
        Scanner sc = new Scanner(System.in);
        String[] linha1 = (sc.nextLine()).split(" ");
        String[] linha2 = (sc.nextLine()).split(" ");

        int codPeca1 = Integer.parseInt(linha1[0]);
        int qtdPeca1 = Integer.parseInt(linha1[1]);
        double valorPeca1Unica = Double.parseDouble(linha1[2]);
        int codPeca2 = Integer.parseInt(linha2[0]);
        int qtdPeca2 = Integer.parseInt(linha2[1]);
        double valorPeca2Unica = Double.parseDouble(linha2[2]);


        Double valorTotal = (qtdPeca1 * valorPeca1Unica) + (qtdPeca2 * valorPeca2Unica);
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorTotal);

        sc.close();
    }
}
