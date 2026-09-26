package task_1;

import java.util.Scanner;

public class mesele_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Həftənin gününü daxil edin (1-7): ");
        int gun = scanner.nextInt();

        switch (gun) {
            case 1:
                System.out.println("Bazar ertəsi");
                break;
            case 2:
                System.out.println("Çərşənbə axşamı");
                break;
            case 3:
                System.out.println("Çərşənbə");
                break;
            case 4:
                System.out.println("Cümə axşamı");
                break;
            case 5:
                System.out.println("Cümə");
                break;
            case 6:
                System.out.println("Şənbə");
                break;
            case 7:
                System.out.println("Bazar");
                break;
            default:
                System.out.println("Yanlış gün daxil edilib! (1-7 arasında olmalıdır)");
                break;
        }

        scanner.close();
    }
}