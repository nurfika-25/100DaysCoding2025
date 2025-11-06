import java.util.Scanner;
public class NewClass {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Nilai N: ");
    int N = in.nextInt();
    System.out.println("Angka Ganjil dari " + N + " hingga 1:");
        for (int i = N; i >= 1; i--) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n\nAngka Genap dari " + N + " hingga 1:");
        for (int i = N; i >= 1; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
               
            }
        }
    }
}
