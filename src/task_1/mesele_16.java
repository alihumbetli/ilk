package task_1;

import java.util.Scanner;

public class mesele_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir ədəd daxil edin: ");
        int eded = scanner.nextInt();

        System.out.println(eded + " ədədinin vurma cədvəli:");

        for (int i = 1; i <= 10; i++) {
            System.out.println(eded + " x " + i + " = " + (eded * i));
        }

        scanner.close();
    }
}