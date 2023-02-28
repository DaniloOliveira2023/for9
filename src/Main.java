import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = 0;
        double h = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o valor de n");
        n = s.nextInt();
        for (double i= 0; i<=n; i++) {
            h = h + 1/n;
        }
        System.out.println("O valor de h é " +h);
    }
}