package task_1;

import java.util.Scanner;

public class mesele_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("N ədədini daxil edin: ");
        int n = scanner.nextInt();

        int sayac = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sayac++;
            }
        }

        System.out.println("1-dən " + n + "-ə qədər cüt ədədlərin sayı: " + sayac);

        scanner.close();
    }
}