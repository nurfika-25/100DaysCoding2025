import java.util.Scanner;
public class NewClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Panjang Persegi: ");
        int P = in.nextInt();
        System.out.print("Masukkan Lebar Persegi: ");
        int L = in.nextInt();
            for (int i = 1; i <= P; i++) {           
            for (int j = 1; j <= L; j++) { 
              System.out.print("*");
            }
              System.out.println();
        }
    }
}
