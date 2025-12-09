package javaapplication44;

public class Day93 {

    public static double bulatAtas(double angka) { 
        return Math.ceil(angka);
    }
    public static double bulatBawah(double angka) { 
        return Math.floor(angka);
    }
    public static long bulatNormal(double angka) { 
        return Math.round(angka);
    }
    public static void main(String[] args) {

        double nilai = 25.3;

        System.out.println("Nilai Dari angka yang ingin di bulatkan adalah = " + nilai);
        System.out.println("BulatanCeil  = " + bulatAtas(nilai));
        System.out.println("BulatanFloor = " + bulatBawah(nilai));
        System.out.println("BulatanRound = " + bulatNormal(nilai));
    }
}
