import java.util.Scanner;
import java.util.Stack;

class Main {

    public static int verificarDiamantes(String expr) {
        int diamantes = 0;
        Stack<Character> pilha = new Stack();

        for (int i = 0; i < expr.length(); i++) {
            char c = expr.charAt(i);

            if (c == '<') {
                pilha.push(c);
            }

            if (c == '>') {
                if (!pilha.isEmpty()) {
                    pilha.pop();
                    diamantes++;
                }
            }

        }

        return diamantes;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String expressao;

        for (int i = 0; i < n; i++) {
            expressao = sc.nextLine();
            System.out.println(verificarDiamantes(expressao));
        }

        sc.close();
    }
}
