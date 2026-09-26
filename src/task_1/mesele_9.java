package task_1;

import java.util.Scanner;

public class mesele_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Balı daxil edin (0-100): ");
        int bal = scanner.nextInt();

        if (bal < 0 || bal > 100) {
            System.out.println("Yanlış bal daxil edilib! Bal 0 ilə 100 arasında olmalıdır.");
        } else {
            int onluq = bal / 10;

            switch (onluq) {
                case 10:
                case 9:
                    System.out.println("A");
                    break;
                case 8:
                    System.out.println("B");
                    break;
                case 7:
                    System.out.println("C");
                    break;
                case 6:
                    System.out.println("D");
                    break;
                default:
                    System.out.println("F");
                    break;
            }
        }

        scanner.close();
    }
}