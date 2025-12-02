public class MetodAsdos {

    public static void main(String[] args) {
        int[] angka = {12, 7, 25, 3, 8, 2, 5};
        int min = angka[0];
        for (int i = 1; i < angka.length; i++) {
            if (angka[i] < min) {
                min = angka[i];
            }
        }

        System.out.println("Angka minimal Array adalah: " + min);
    }
}
