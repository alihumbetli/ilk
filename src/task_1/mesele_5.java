package task_1;

import java.util.Scanner;

public class mesele_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir ədəd daxil edin: ");
        int eded = scanner.nextInt();

        if (eded % 2 == 0) {
            System.out.println(eded + " cüt ədəddir.");
        } else {
            System.out.println(eded + " tək ədəddir.");
        }

        scanner.close();
    }
}