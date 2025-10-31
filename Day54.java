public class Arrayy {  
    public static void main(String[] args) {
        System.out.println("Tampilkan angka 1-15, kecuali angka genap: ");
        for (int i = 1; i <=15; i++) {
            if (i %2==0) {
            continue;
            }   
                System.out.println(i);
        }
    }
}
