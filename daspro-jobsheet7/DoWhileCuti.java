import java.util.Scanner;
public class DoWhileCuti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jatahCuti, jumlahHari;
        String konfirmasi;
        System.out.println("Jatah Cuti : ");
        jatahCuti = sc.nextInt();

        do {
            System.out.print("Apakah anda ingin mengambil cuti? (y/t) : ");
            konfirmasi = sc.next();

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("Jumlah hari : ");
                jumlahHari = sc.nextInt();
                sc.nextLine(); 

                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti : " +jatahCuti);
                } else {
                    System.out.println("Sisa jatah cuti anda tidak mencukupi. anda memiliki " +jatahCuti + "hari cuti");
                }
            } else if (konfirmasi.equalsIgnoreCase("t")) {
                break;
            } else {
                System.out.println("Input konfirmasi salah");
            }
        } while (jatahCuti > 0);   
    } 
}
