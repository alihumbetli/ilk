package task_1;

import java.util.Scanner;

public class mesele_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir ədəd daxil edin: ");
        int eded = scanner.nextInt();

        int sayac = 0;
        int muveqqati = Math.abs(eded);

        if (muveqqati == 0) {
            sayac = 1;
        } else {
            while (muveqqati > 0) {
                muveqqati /= 10;
                sayac++;
            }
        }

        System.out.println(eded + " ədədinin rəqəmlərinin sayı: " + sayac);

        scanner.close();
    }
}