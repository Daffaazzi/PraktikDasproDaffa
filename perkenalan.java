public class perkenalan {
    private String nama;
    private String kota;

    public perkenalan(String nama, String kota) {
        this.nama = nama;
        this.kota = kota;
    }

    public perkenalan() {
        this("Daffa", "Bandung");
    }

    public void introduce() {
        System.out.println("Halo, nama saya " + nama + " dari kota " + kota + ".");
    }

    public static void main(String[] args) {
        perkenalan p = new perkenalan();
        p.introduce();
    }
}
