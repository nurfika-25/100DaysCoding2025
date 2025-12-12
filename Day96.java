import java.util.Scanner;
public class Day93 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        System.out.println("Masukkan Angka: ");
        int a=in.nextInt();
        int b=in.nextInt();
        System.out.println("Penjulahan dari kedua angka adalah: "+arit(a,b));
        System.out.println("Pengurangan dari kedua angka adalah: "+arit1(a,b));
        System.out.println("Perkalian dari kedua angka adalah: "+ac(a,b));
        System.out.println("Pembagian dari kedua angka adalah: "+de(a,b));
    }
    static int arit(int a,int aa){
       return a+aa;   
    }
    static int arit1(int b,int bb){
       return b-bb;   
    }
    static int ac(int c,int cc){
        return c*cc;
    }
    static int de (int d, int dd){
        return d/dd;
    }
