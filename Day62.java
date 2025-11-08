import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N, jumlah = 0;

        System.out.print("Masukkan nilai N: ");
        N = in.nextInt();

        for (int i = 1; i <= N; i++) {
            jumlah += i;  
        }

        System.out.println("Jumlah bilangan dari 1 sampai " + N + " adalah: " + jumlah);
    }
}
