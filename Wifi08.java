import java.util.Scanner;

public class Wifi08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Sistem Akses WiFi Kampus ===");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        if (uktLunas) {
            System.out.println("Akses WiFi DIBERIKAN. Selamat menggunakan fasilitas kampus.");
        } else {
            System.out.println("Akses WiFi DITOLAK. Silakan lunasi UKT terlebih dahulu.");
        }

        sc.close();
    }
}
