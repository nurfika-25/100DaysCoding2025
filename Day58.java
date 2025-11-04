import java.util.Scanner;
public class NewClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int N = input.nextInt();
        System.out.println("Angka dari 1 ke " + N + ": ");
        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\nAngka dari " + N + " ke 1: ");
        for (int i = N; i >= 1; i--) {
            System.out.print(i + "  ");
            
        }
    }
}
    
