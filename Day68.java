import java.util.Scanner;
public class NewClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Ukuran Persegi: ");
        int U = in.nextInt();
            for (int i = 1; i <= U; i++) {           
            for (int j = 1; j <= U; j++) { 
              System.out.print(" fika ");
            }
              System.out.println();
        }
    }
}
