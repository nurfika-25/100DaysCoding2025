package fika_D0225006;

import java.util.Scanner;


public class NewClass {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nama\t: ");
        final String nama = in.nextLine(); //konstanta digunakan agar variabelnya tidak bisa diubah
        System.out.print("Masukkan NIM\t: ");
        String nim = in.nextLine();
        System.out.print("Masukkan umur\t: ");
        int umur = in.nextInt();
        System.out.print("Masukkan gender\t: ");
        char gender = in.next().charAt(0);
        System.out.println();
        System.out.println("Perkenalkan nama saya\t: "+nama);
        System.out.println("Dengan NIM saya\t\t: "+nim);
        System.out.println("Saya berumur\t\t: "+umur+" tahun");
        System.out.println("Gender saya\t\t: "+gender);
         
    }
 
}
