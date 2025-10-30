public class fikaTernary {
    public static void main(String[] args) {
    int angka = 1;
        while (angka <= 10) {
            System.out.println("Angka: " + angka);
            if (angka >5) {
               System.out.println("Berhenti di angka: " + angka);
               break; 
            }
            angka++;
        }
        
        System.out.println("Perulangan Selesai.");
    }
}
