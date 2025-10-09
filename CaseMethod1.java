import java.util.Scanner;

import javax.print.attribute.HashPrintRequestAttributeSet;

public class CaseMethod1 {
    public static void main(String[] args) {
      java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.println("=====INPUT DATA MAHASISWA=====");
        System.out.print("Nama : ");
        String nama = input.nextLine();

        System.out.print("NIM  : ");
        String nim = input.nextLine();
         System.out.println();

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
         System.out.println();
  
  
        double utsAP = Double.parseDouble(Nilai);
        double uasAP = Double.parseDouble(Nilai1);
        double tugasAP = Double.parseDouble(Nilai2);

        double utsSD = Double.parseDouble(Nilai3);
        double uasSD = Double.parseDouble(Nilai4);
        double tugasSD = Double.parseDouble(Nilai5);

        double nilaiAkhirAP = (0.3 * utsAP) + (0.4 * uasAP) + (0.3 * tugasAP);
        double nilaiAkhirSD = (0.3 * utsSD) + (0.4 * uasSD) + (0.3 * tugasSD);

        // determine letter grades and statuses for both courses
        String HurufAP;
        if (nilaiAkhirAP >= 80 && nilaiAkhirAP <= 100) {
            HurufAP = "A";
        } else if (nilaiAkhirAP >= 73 && nilaiAkhirAP < 80) {
            HurufAP = "B+";
        } else if (nilaiAkhirAP >= 65 && nilaiAkhirAP < 73) {
            HurufAP = "B";
        } else if (nilaiAkhirAP >= 60 && nilaiAkhirAP < 65) {
            HurufAP = "C+";
        } else if (nilaiAkhirAP >= 50 && nilaiAkhirAP < 60) {
            HurufAP = "C";
        } else if (nilaiAkhirAP >= 39 && nilaiAkhirAP < 50) {
            HurufAP = "D";
        } else if (nilaiAkhirAP >= 0 && nilaiAkhirAP < 39) {
            HurufAP = "E";
        } else {
            HurufAP = "Nilai tidak valid";
        }
        String statusAP = (nilaiAkhirAP >= 70 && nilaiAkhirAP <= 100) ? "LULUS" : "TIDAK LULUS";

        String HurufSD;
        if (nilaiAkhirSD >= 80 && nilaiAkhirSD <= 100) {
            HurufSD = "A";
        } else if (nilaiAkhirSD >= 73 && nilaiAkhirSD < 80) {
            HurufSD = "B+";
        } else if (nilaiAkhirSD >= 65 && nilaiAkhirSD < 73) {
            HurufSD = "B";
        } else if (nilaiAkhirSD >= 60 && nilaiAkhirSD < 65) {
            HurufSD = "C+";
        } else if (nilaiAkhirSD >= 50 && nilaiAkhirSD < 60) {
            HurufSD = "C";
        } else if (nilaiAkhirSD >= 39 && nilaiAkhirSD < 50) {
            HurufSD = "D";
        } else if (nilaiAkhirSD >= 0 && nilaiAkhirSD < 39) {
            HurufSD = "E";
        } else {
            HurufSD = "Nilai tidak valid";
        }
        String statusSD = (nilaiAkhirSD >= 70 && nilaiAkhirSD <= 100) ? "LULUS" : "TIDAK LULUS";

        System.out.println ("============ HASIL PENILAIAN MAHASISWA ============");
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim);  
        System.out.println();
 
        System.out.println("MATA KULIAH\t\t\t   UTS\t         UAS\t        Tugas\t       Nilai Akhir\tNilai Akhir\tSTATUS");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Algoritma dan Pemrograman : \t" + utsAP + "\t\t" + uasAP + "\t\t" + tugasAP + "\t\t" + nilaiAkhirAP + "\t\t" + HurufAP + "\t\t" + statusAP);
        System.out.println("Struktur Data             : \t" + utsSD + "\t\t" + uasSD + "\t\t" + tugasSD + "\t\t" + nilaiAkhirSD + "\t\t" + HurufSD + "\t\t" + statusSD);


        System.out.println("Nilai Akhir Algoritma dan Pemrograman: " + nilaiAkhirAP);
        System.out.println("Nilai Akhir Struktur Data: " + nilaiAkhirSD);

    

           if (nilaiAkhirAP >= 80 && nilaiAkhirAP <= 100) {
                System.out.println("Huruf Algoritma dan Pemrograman: A");
            } else if (nilaiAkhirAP >= 73 && nilaiAkhirAP < 80) {
                System.out.println("Huruf Algoritma dan Pemrograman: B+");
            } else if (nilaiAkhirAP >= 65 && nilaiAkhirAP < 70) {
                System.out.println("Huruf Algoritma dan Pemrograman: B");
            } else if (nilaiAkhirAP >= 60 && nilaiAkhirAP < 65) {
                System.out.println("Huruf Algoritma dan Pemrograman: C+");
            } else if (nilaiAkhirAP >= 50 && nilaiAkhirAP < 60) {
                System.out.println("Huruf Algoritma dan Pemrograman: C+");
            } else if (nilaiAkhirAP >= 39 && nilaiAkhirAP < 50) {
                System.out.println("Huruf Algoritma dan Pemrograman: D");
            } else if (nilaiAkhirAP >= 0 && nilaiAkhirAP < 39) {
                System.out.println("Huruf Algoritma dan Pemrograman: E");
            } else {
                System.out.println("Nilai tidak valid untuk Algoritma dan Pemrograman.");
            }

            if (nilaiAkhirSD >= 80 && nilaiAkhirSD <= 100) {
                System.out.println("Huruf Struktur Data: A");
            } else if (nilaiAkhirSD >= 73 && nilaiAkhirSD < 80) {
                System.out.println("Huruf Struktur Data: B+");
            } else if (nilaiAkhirSD >= 65 && nilaiAkhirSD < 70) {
                System.out.println("Huruf Struktur Data: B");
            } else if (nilaiAkhirSD >= 60 && nilaiAkhirSD < 65) {
                System.out.println("Huruf Struktur Data: C+");
            } else if (nilaiAkhirSD >= 50 && nilaiAkhirSD < 60) {
                System.out.println("Huruf Struktur Data: C+");
            } else if (nilaiAkhirSD >= 39 && nilaiAkhirSD < 50) {
                System.out.println("Huruf Struktur Data: D");
            } else if (nilaiAkhirSD >= 0 && nilaiAkhirSD < 39) {
                System.out.println("Huruf Struktur Data: E");
            } else {
                System.out.println("Nilai tidak valid untuk Struktur Data.");
            }
            double rata = (nilaiAkhirAP + nilaiAkhirSD) / 2;
            System.out.println("Rata-rata Nilai: " + rata);
            if (rata >= 70) {
              System.out.println("Status Semester: LULUS");
            } else {
              System.out.println("Status Semester: TIDAK LULUS");

              double ra = (nilaiAkhirAP + nilaiAkhirSD) / 2;
        String statusSemester = (rata >= 70) ? "LULUS" : "TIDAK LULUS (Rata-rata < 70)";

            }

    

            }

        }