import java.util.Scanner;
public class ArrayRataNilai24 {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

    System.out.println("Masukkan jumlah mahasiswa : ");
    int jmlMhs = sc.nextInt();

    int[] nilaiMhs = new int [jmlMhs];
    double totalLulus = 0, totalTdkLulus = 0;
    double rata2Lulus = 0, rata2TdkLulus = 0;

    for (int i = 0; i < nilaiMhs.length; i++) {
        System.out.print("Masukkan nilai mahasiswa ke-" +(i+1)+" : ");
        nilaiMhs [i] = sc.nextInt();
    }
    int counterLulus = 0, counterTdklulus = 0;
    for (int i = 0; i < nilaiMhs.length; i++) {
        if (nilaiMhs[i]>70) {
            totalLulus += nilaiMhs [i];
            counterLulus++;
        } else {
            totalTdkLulus += nilaiMhs[i];
            counterTdklulus++;
        }
    }
    rata2Lulus = totalLulus/counterLulus;
    rata2TdkLulus = totalTdkLulus/counterTdklulus;
    System.out.println("rata-rata nilai lulus = " +rata2Lulus);
    System.out.println("rata-rata nilai tidak lulus =" +rata2TdkLulus);
    }
    }

