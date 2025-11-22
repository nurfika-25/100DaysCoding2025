public class NewClass {
    public static void main(String[] args) {

        String kata1 = "selamat malam";
        String kata2 = "Selamat Malam";
        String kalimat = "saya mengucapkan selamat malam kepada kalian";
        String kosong = "";

        // equals()
        boolean cek1 = kata1.equals(kata2);
        System.out.println("Equals: " + cek1); // false

        // equalsIgnoreCase()
        boolean cek2 = kata1.equalsIgnoreCase(kata2);
        System.out.println("Equals Ignore Case: " + cek2); // true

        // contains()
        boolean cek3 = kalimat.contains("selamat malam");
        System.out.println("Contains 'selamat malam': " + cek3); // true

        // isEmpty()
        boolean cek4 = kosong.isEmpty();
        System.out.println("Is Empty: " + cek4); // true
    
        }
      }
