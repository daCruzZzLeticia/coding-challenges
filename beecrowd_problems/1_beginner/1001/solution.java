import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        InputStreamReader inputReader = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(inputReader);

        int a = Integer.parseInt(input.readLine());
        int b = Integer.parseInt(input.readLine());

        int soma = a + b;
        System.out.println("X = " + soma);
    }
}
