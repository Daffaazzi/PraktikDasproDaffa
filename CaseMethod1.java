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
        
        System.out.println("MATAKULIAH\t\tUTS\t\tUAS\t\tTugas\t\tNilai Akhir\t\tNILAI HURUF\t\tSTATUS");
        System.out.println("Nilai Akhir Algoritma dan Pemrograman: " + nilaiAkhirAP);
        System.out.println("Nilai Akhir Struktur Data: " + nilaiAkhirSD);

       if (nilaiAkhirAP >= 80 && nilaiAkhirAP <= 100) {
            System.out.println("Grade Algoritma dan Pemrograman: A");
        } else if (nilaiAkhirAP >= 73 && nilaiAkhirAP < 80) {
            System.out.println("Grade Algoritma dan Pemrograman: B+");
        } else if (nilaiAkhirAP >= 65 && nilaiAkhirAP < 70) {
            System.out.println("Grade6 Algoritma dan Pemrograman: B");
        } else if (nilaiAkhirAP >= 60 && nilaiAkhirAP < 65) {
            System.out.println("Grade Algoritma dan Pemrograman: C+");
        } else if (nilaiAkhirAP >= 50 && nilaiAkhirAP < 60) {
            System.out.println("Grade Algoritma dan Pemrograman: C+");
        } else if (nilaiAkhirAP >= 39 && nilaiAkhirAP < 50) {
            System.out.println("Grade6 Algoritma dan Pemrograman: D");
        } else if (nilaiAkhirAP >= 0 && nilaiAkhirAP < 39) {
            System.out.println("Grade Algoritma dan Pemrograman: E");
        } else {
            System.out.println("Nilai tidak valid untuk Algoritma dan Pemrograman.");
        }

        if (nilaiAkhirSD >= 80 && nilaiAkhirSD <= 100) {
            System.out.println("Grade Struktur Data: A");
        } else if (nilaiAkhirSD >= 73 && nilaiAkhirSD < 80) {
            System.out.println("Grade Struktur Data: B+");
        } else if (nilaiAkhirSD >= 65 && nilaiAkhirSD < 70) {
            System.out.println("Grade6 Struktur Data: B");
        } else if (nilaiAkhirSD >= 60 && nilaiAkhirSD < 65) {
            System.out.println("Grade Struktur Data: C+");
        } else if (nilaiAkhirSD >= 50 && nilaiAkhirSD < 60) {
            System.out.println("Grade Struktur Data: C+");
        } else if (nilaiAkhirSD >= 39 && nilaiAkhirSD < 50) {
            System.out.println("Grade6 Struktur Data: D");
        } else if (nilaiAkhirSD >= 0 && nilaiAkhirSD < 39) {
            System.out.println("Grade Struktur Data: E");
        } else {
            System.out.println("Nilai tidak valid untuk Struktur Data.");


        
        }

      }
    }
