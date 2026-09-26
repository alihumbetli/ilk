package task_1;

import java.util.Scanner;

public class mesele_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sayac = 0;

        System.out.print("Ədəd daxil edin (dayandırmaq üçün 0 yazın): ");
        int eded = scanner.nextInt();

        while (eded != 0) {
            sayac++;
            System.out.print("Növbəti ədədi daxil edin (0 - dayandırır): ");
            eded = scanner.nextInt();
        }

        System.out.println("Daxil edilən ədədlərin sayı: " + sayac);

        scanner.close();
    }
}