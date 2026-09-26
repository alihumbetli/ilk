package task_1;

import java.util.Scanner;

public class mesele_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("N ədədini daxil edin: ");
        int n = scanner.nextInt();

        long hasil = 1;

        for (int i = 1; i <= n; i++) {
            hasil *= i;
        }

        System.out.println(n + "! = " + hasil);

        scanner.close();
    }
}