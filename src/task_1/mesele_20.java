package task_1;

import java.util.Scanner;

public class mesele_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir ədəd daxil edin: ");
        int eded = scanner.nextInt();

        int muveqqati = Math.abs(eded);
        int cem = 0;

        while (muveqqati > 0) {
            int qaliq = muveqqati % 10;
            cem += qaliq;
            muveqqati /= 10;
        }

        System.out.println(eded + " ədədinin rəqəmlərinin cəmi: " + cem);

        scanner.close();
    }
}