package task_1;

import java.util.Scanner;

public class mesele_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Yaşınızı daxil edin: ");
        int yas = scanner.nextInt();

        if (yas >= 0 && yas <= 12) {
            System.out.println("uşaq");
        } else if (yas >= 13 && yas <= 17) {
            System.out.println("yeniyetmə");
        } else if (yas >= 18) {
            System.out.println("yetkin");
        } else {
            System.out.println("Yanlış yaş daxil edilib!");
        }

        scanner.close();
    }
}