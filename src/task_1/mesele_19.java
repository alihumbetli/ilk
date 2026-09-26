package task_1;

import java.util.Scanner;

public class mesele_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir ədəd daxil edin: ");
        int eded = scanner.nextInt();

        int muveqqati = Math.abs(eded);
        int tersEded = 0;

        while (muveqqati > 0) {
            int qaliq = muveqqati % 10;
            tersEded = tersEded * 10 + qaliq;
            muveqqati /= 10;
        }


        if (eded < 0) {
            tersEded = -tersEded;
        }

        System.out.println(eded + " ədədinin tərsi: " + tersEded);

        scanner.close();
    }
}