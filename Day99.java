import java.util.Scanner;

public class Day93 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan batas: ");
        int n = in.nextInt();
         for (int i = 2; i <= n; i++) {
            int a = 0;
             for (int j = 2; j < i; j++) {
                 if (i%j==0) {
                     a++;
                     break;
                 }
             }
                 if (a==0) {
                     System.out.print(i+" ");
                 }
        }
    }
}    
