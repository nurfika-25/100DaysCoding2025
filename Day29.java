import java.util.Scanner;
public class fika123 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan tinggi fika: ");
        double a = in.nextDouble();
        System.out.print("Masukkan tinggi aksa: ");
        double b = in.nextDouble();
        
        boolean c = a>b;
        boolean d = a<b;
        System.out.printf("Tinggi fika:%.2f %s",a," meter");
        System.out.printf("\nTinggi aksa:%.2f %s\n",b," meter");
        System.out.println("Apakah fika lebih tinggi daripada aksa?? : "+c);
        System.out.println("Apakah aksa lebih tinggi daripada fika?? : "+d);
    }
}
