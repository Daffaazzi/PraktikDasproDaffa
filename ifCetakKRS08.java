import java.util.Scanner;

public class ifCetakKRS08 {
    java.util.Scanner daffa = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---Cetak KRS SAKAD---");
        System.out.print("apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        if (uktLunas) {
            System.out.println("pembayaran UKT terverifikasi");
            System.out.println("Silakan cetak KRS dan minta tanda tangan DPA");
        } else {
            System.out.println("Registrasi ditolak, silahkan lunasi UKT terlebih dahulu");
        }

        String hasil = uktLunas 
            ? "pembayaran UKT terverifikasi\nSilakan cetak KRS dan minta tanda tangan DPA"
            : "Registrasi ditolak, silahkan lunasi UKT terlebih dahulu";

        System.out.println("\n[Versi Ternary Operator] " + hasil);

        sc.close();
    }
}
