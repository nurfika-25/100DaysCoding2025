import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
       System.out.print("Masukkan nilai N:  ");
        int N = in.nextInt();
        int hasil = 1;
  
          for (int i = 1; i <= N; i++) {
             hasil *= i;
        } 
        System.out.println("Hasil perkalian 1 sampai " + N + " adalah: " + hasil);
    }
}
