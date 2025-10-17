package Nurfika_D0225006;
import java.util.Scanner;
public class Fika_20 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Masukkan angka: ");
        double angka1 = in.nextDouble();
        System.out.print("Masukkan operator(+,-,*,/,% :) ");
        char op  = in.next().charAt(0);
        System.out.print("Masukkan angka: ");
        double angka2 = in.nextDouble();
        double a;
        if (op=='+') {
            a = angka1+angka2;
            System.out.println("jumlah: "+a);
        }
        else if (op=='-') {
            a = angka1-angka2;
            System.out.println("jumlah: "+a);
        }
        else if (op=='*') {
            a = angka1*angka2;
            System.out.println("jumlah: "+a);
        }
        else if (op=='/') {
            a = angka1/angka2;
            System.out.println("jumlah: "+a);
        }
        else{
            a = angka1%angka2;
            System.out.println("jumlah: "+a);
        }
    }
    
}
