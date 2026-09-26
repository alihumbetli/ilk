package task_1;

import java.util.Scanner;

public class mesele_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("N ədədini daxil edin: ");
        int n = scanner.nextInt();

        int cem = 0;

        for (int i = 1; i <= n; i++) {
            cem += i;
        }

        System.out.println("1-dən " + n + "-ə qədər ədədlərin cəmi: " + cem);

        scanner.close();
    }
}