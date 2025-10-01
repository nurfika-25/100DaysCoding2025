import java.util.Scanner;
public class fika123 {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in); 
        System.out.print("Masukkan nilai jari-jari lingkaran : ");
        double r  = in.nextDouble();
        double pi = 3.14; //Nilai dari phi
        double luas = Math.PI * r * r; //Rumus menghitung jari-jari lingkaran
        System.out.printf("Luas lingkaran dengan jari-jari %.2f cm adalah %.2f cm²%n", r, luas);
    }
}
