package SoalFika;
import java.util.Scanner;
public class fikaayo {
    public static void main(String[] args) {
    Scanner in= new Scanner (System.in); 
        System.out.println("Masukkan Nama: ");
        String Nama= in.nextLine();
        System.out.println("Masukkan Nilai: ");
        int Nilai= in.nextInt();
    
            if (Nilai >=85 && Nilai <=100) {
                System.out.println("Predikat Nilai Anda adalah A");
           }else if (Nilai >=70 && Nilai <=85) {
                System.out.println("Predikat Nilai Anda adalah B ");
           }else if (Nilai >=65 && Nilai <=70) {
                System.out.println("Predikat Nilai Anda adalah C");
           }else if (Nilai >=50 && Nilai <=65) {
                System.out.println("Predikat Nilai Anda adalah D");
           }else if (Nilai >=0 && Nilai <=50) {
                System.out.println("Predikat Nilai Anda adalah E");
           }else {
                System.out.println("Nilai tidak valid");
           }
            
    } 
}
    
