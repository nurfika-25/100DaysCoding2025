public class NewClass {
    public static void main(String[] args) {
        int[] data = {12, 7, 25, 3, 8, 2};
        int max = data[0]; 
        for (int angka : data) {
            if (angka > max) {
                max = angka;
            }
        }

        System.out.println("Angka maksimal dari Array adalah:  " + max);
    }
}
