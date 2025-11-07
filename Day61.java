import java.util.Scanner;
public class NewClass{ 
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai M (kelipatan): ");
        int M = input.nextInt();

        System.out.print("Masukkan nilai N (batas): ");
        int N = input.nextInt();

        System.out.println("Bilangan kelipatan " + M + " dari 1 sampai " + N + " adalah:");

        for (int i = 1; i <= N; i++) {
            if (i % M == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
