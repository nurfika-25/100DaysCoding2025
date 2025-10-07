import java.util.Scanner;
public class fika123 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int x = in.nextInt();
        System.out.print("Masukkan angka: ");
        int y = in.nextInt();        
        System.out.println("Apakah nilai x lebih besar sama dengan y? :"+(x >= y));
        System.out.println("Apakah nilai x lebih kecil sama dengan y? :"+(x <= y));  
    }
}
