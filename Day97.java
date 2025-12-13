import java.util.Scanner;
public class Day93 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    int a = in.nextInt();
        System.out.println("Luas persegi : "+perseginyafika(a));
    }static int perseginyafika(int sisi ){
        int hasil=sisi*sisi;
        return hasil;
    }
}
