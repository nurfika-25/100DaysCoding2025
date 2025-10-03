import java.util.Scanner;
public class fika123 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int a = in.nextInt();
        a += 5;   //inputan variabel angka yang dimasukkan akan ditambah dengan 5
        System.out.println(a);  
        a -= 5;   //inputan variabel angka yang dimasukkan akan dikurangi dengan 5
        System.out.println(a);  
        a *= 5;   //inputan variabel angka yang dimasukkan akan dikali dengan 5
        System.out.println(a);  
        a /= 5;   //inputan variabel angka yang dimasukkan akan dibagi dengan 5
        System.out.println(a);  
        a = 5;    //inputan variabel akan kembali ke angka 5
        System.out.println(a);
    
    }
     }
