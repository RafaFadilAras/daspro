import java.util.Scanner;
public class NestedLoop_2341720007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double[][] temps = new double [5][7];

        for (int i =0; i<temps.length; i++) {
            System.out.println("Kota ke-" + (i+1));
            for (int j =0; j<temps[0].length; j++) {
                System.out.print("hari ke-" + (j+1) + ": ");
                temps [i][j] = sc.nextDouble();
            }
            System.out.println();
        }
        
        int i =1;
        for (double[] kota : temps) {
            System.out.print("Kota ke-" +1+ ": ");
            for (double hari : kota) {
                System.out.print(hari + " ");
            }
            System.out.println();
            i++;
        }
            }
        }
    