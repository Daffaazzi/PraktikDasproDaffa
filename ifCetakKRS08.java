import java.util.Scanner;

public class ifCetakKRS08 {
    java.util.Scanner  daffa= new java.util.Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---Cetak KRS SAKAD---");
        System.out.println("apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        if(uktLunas) {
            System.out.println("pembayaran UKT terverifikasi");
            System.out.println("Silakan cetak KRS dan minta tanda tangan DPA");

        }
    }
}
