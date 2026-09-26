package task_1;

import java.util.Scanner;

public class mesele_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci ədədi daxil edin: ");
        int a = scanner.nextInt();

        System.out.print("İkinci ədədi daxil edin: ");
        int b = scanner.nextInt();

        int cem = a + b;
        int ferq = a - b;
        int hasil = a * b;
        double bolme = (double) a / b;
        int qaliq = a % b;

        System.out.println("Cəm: " + cem);
        System.out.println("Fərq: " + ferq);
        System.out.println("Hasil: " + hasil);
        System.out.println("Bölmə: " + bolme);
        System.out.println("Qalıq: " + qaliq);

        scanner.close();
    }
}