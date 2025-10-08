import java.util.Scanner;
public class fika123 {
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        double x = in.nextDouble();
        System.out.print("Masukkan angka: ");
        double y = in.nextDouble();
        
        boolean p = x>y && y<=x; 
        boolean q = x<=y && y>=x;
        System.out.println("Apakah nilai x lebih besar sama dengan y dan apakah nilai y lebih kecil sama dengan x?: " +p);
        System.out.println("Apakah nilai x lebih kecil sama dengan y dan apakah nilai y lebih besar sama dengan x?: " +q);
      
    }
}
