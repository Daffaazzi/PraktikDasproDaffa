public class ifElseCetakKRS08 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in); 

        System.out.println("---Cetak KRS SIAKAD---");
        System.out.print("Apakah UKT sudah lunas? (true/false)");
        boolean uktLunas = input.nextBoolean();

        String pesan = uktLunas ? "Pembayaran UKT Terverifikasi\nSilahkan cetak KRS dan minta tanda tangan DPA" : "Registrasi Gagal! Silahkan lunasi UKT";
        System.out.println(pesan);
    }
}
