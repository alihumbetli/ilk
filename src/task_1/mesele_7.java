package task_1;

import java.util.Scanner;

public class mesele_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir ədəd daxil edin: ");
        int eded = scanner.nextInt();

        if (eded > 0) {
            System.out.println(eded + " müsbət ədəddir.");
        } else if (eded < 0) {
            System.out.println(eded + " mənfi ədəddir.");
        } else {
            System.out.println("Daxil edilən ədəd sıfırdır.");
        }

        scanner.close();
    }
}