import java.util.Scanner;
public class NewClass {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Nilai N: ");
        int N = in.nextInt();
        System.out.println("\nAngka Ganjil 1 - " + N + ":");
        for (int i = 1; i <= N; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n\nAngka Genap 1 - " + N + ":");
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
