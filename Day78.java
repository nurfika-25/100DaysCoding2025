public class NewClass {
    public static void main(String[] args) {

        String kalimat = "selamat malam semua";

        // 1. length()
        int panjang = kalimat.length();

        // 2. toUpperCase()
        String besar = kalimat.toUpperCase();

        // 3. toLowerCase()
        String kecil = kalimat.toLowerCase();

        // 4. charAt()
        char hurufPertama = kalimat.charAt(0);

        // 5. substring()
        String potongan = kalimat.substring(8); // mulai dari index 8 → "malam semua"

        System.out.println("Kalimat Asli     : " + kalimat);
        System.out.println("1. length()      : " + panjang);
        System.out.println("2. toUpperCase() : " + besar);
        System.out.println("3. toLowerCase() : " + kecil);
        System.out.println("4. charAt(0)     : " + hurufPertama);
        System.out.println("5. substring(8)  : " + potongan);
    }
}
