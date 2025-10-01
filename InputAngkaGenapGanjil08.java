public class InputAngkaGenapGanjil08 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.println("Masukkan angka: ");
        int angka = input.nextInt();

        if (angka % 2 == 0) {
            System.out.println( " adalah angka genap");
        } else {
            System.out.println( " adalah angka ganjil");
        }
    }
}
