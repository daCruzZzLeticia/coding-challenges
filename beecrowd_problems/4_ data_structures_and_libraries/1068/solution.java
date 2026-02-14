import java.util.Scanner;
import java.util.Stack;

class Main {

    public static String verificarExpressao(String expr) {

        Stack<Character> pilha = new Stack();

        for (int i = 0; i < expr.length(); i++) {
            char c = expr.charAt(i);

            if (c == '(') {
                pilha.push(c);
            }

            if (c == ')') {
                if (pilha.isEmpty()) {
                    return "incorrect";
                }
                pilha.pop();

            }

        }

        return pilha.isEmpty() ? "correct" : "incorrect";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String expressao = sc.nextLine();
            System.out.println(verificarExpressao(expressao));
        }

        sc.close();
    }
}

