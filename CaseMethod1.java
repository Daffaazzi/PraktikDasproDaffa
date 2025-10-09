import java.util.Scanner;

public class CaseMethod1 {
    public static void main(String[] args) {
      java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.println("=====INPUT DATA MAHASISWA=====");
        System.out.print("Nama : ");
        String nama = input.nextLine();

        System.out.print("NIM  : ");
        String nim = input.nextLine();

        System.out.println("---MATAKULIAH 1: ALGORIMA DAN PEMROGRAMAN---");
        System.out.print("Nilai UTS : ");
        String Nilai = input.nextLine();
        System.out.print("Nilai UAS : ");
        String Nilai1 = input.nextLine();
        System.out.print("Nilai Tugas : ");
        String Nilai2 = input.nextLine();

        System.out.println("---MATAKULIAH 2: STRUKTUR DATA---");
        System.out.print("Nilai UTS : ");
        String Nilai3 = input.nextLine();
        System.out.print("Nilai UAS : ");
        String Nilai4 = input.nextLine();
        System.out.print("Nilai Tugas : ");
        String Nilai5 = input.nextLine();
  
  
        double utsAP = Double.parseDouble(Nilai);
        double uasAP = Double.parseDouble(Nilai1);
        double tugasAP = Double.parseDouble(Nilai2);

        double utsSD = Double.parseDouble(Nilai3);
        double uasSD = Double.parseDouble(Nilai4);
        double tugasSD = Double.parseDouble(Nilai5);

        double nilaiAkhirAP = (0.3 * utsAP) + (0.4 * uasAP) + (0.3 * tugasAP);
        double nilaiAkhirSD = (0.3 * utsSD) + (0.4 * uasSD) + (0.3 * tugasSD);
        System.out.println("Nilai Akhir Algoritma dan Pemrograman: " + nilaiAkhirAP);
        System.out.println("Nilai Akhir Struktur Data: " + nilaiAkhirSD);

      
        
        }
    }
    
