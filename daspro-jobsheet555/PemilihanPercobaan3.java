import java.util.Scanner;

public class PemilihanPercobaan3 {
    public static void main(String[] args) {
        Scanner input24 = new Scanner(System.in);
        
        double angka1, angka2, hasil;
        char operator;

        System.out.print("Masukkan angka pertama:");
        angka1 = input24.nextDouble();
        System.out.print("Masukkan angka kedua:");
        angka2 = input24.nextDouble();
        System.out.print("Masukkan Operator (+ - * /): ");
        operator = input24.next().charAt(0);

        switch (operator) {
            case '+' :
                hasil = angka1 + angka2;
                System.out.println(angka1 + "+" + angka2 + "=" + hasil);
                break;
            case '-':
                hasil = angka1 - angka2;
                System.out.println(angka1 + "-" + angka2 + '=' + hasil);
                break;
            case '*':
                hasil = angka1 * angka2;
                System.out.println(angka1 + '*' + angka2 + '=' + hasil);
                break;
            case '/':
                hasil = angka1 / angka2;
                System.out.println(angka1 + '/' + angka2 + '=' + hasil);

        }

    }
}
