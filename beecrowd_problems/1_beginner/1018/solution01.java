import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int valor = sc.nextInt();

        int cem = (int) (valor / 100);
        int cinquenta = (int) ((valor % 100) / 50);
        int vinte = (int) (((valor % 100) % 50) / 20);
        int dez = (int) ((((valor % 100) % 50) % 20) / 10);
        int cinco = (int) (((((valor % 100) % 50) % 20) % 10) / 5);
        int dois = (int) ((((((valor % 100) % 50) % 20) % 10) % 5) / 2);
        int um = (int) ((((((valor % 100) % 50) % 20) % 10) % 5) % 2);

        System.out.println(valor);
        System.out.println(cem + " nota(s) de R$ 100,00");
        System.out.println(cinquenta + " nota(s) de R$ 50,00");
        System.out.println(vinte + " nota(s) de R$ 20,00");
        System.out.println(dez + " nota(s) de R$ 10,00");
        System.out.println(cinco + " nota(s) de R$ 5,00");
        System.out.println(dois + " nota(s) de R$ 2,00");
        System.out.println(um + " nota(s) de R$ 1,00");

        sc.close();
    }
}
