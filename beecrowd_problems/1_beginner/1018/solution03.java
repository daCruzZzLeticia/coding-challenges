import java.util.Scanner;

class Main {

    // Array com as notas disponíveis (ordem decrescente)
    private static final int[] NOTAS = {100, 50, 20, 10, 5, 2, 1};

    public static void main(String[] args) {
        // try-with-resources garante fechamento automático do Scanner
        try (Scanner sc = new Scanner(System.in)) {
            int valor = sc.nextInt();

            imprimirResultado(valor);
        }
    }

    // Método principal para imprimir o resultado
    private static void imprimirResultado(int valor) {
        System.out.println(valor);

        for (int nota : NOTAS) {
            int qtd = valor / nota; // quantidade de notas dessa denominação
            valor %= nota; // atualiza o valor restante
            System.out.printf("%d nota(s) de R$ %d,00%n", qtd, nota);
        }
    }
}
