package task_1;

import java.util.Scanner;

public class mesele_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ayın nömrəsini daxil edin (1-12): ");
        int ay = scanner.nextInt();

        switch (ay) {
            case 12:
            case 1:
            case 2:
                System.out.println("Qış");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Yaz");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Yay");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Payız");
                break;
            default:
                System.out.println("Yanlış ay nömrəsi daxil edilib! (1-12 arasında olmalıdır)");
                break;
        }

        scanner.close();
    }
}