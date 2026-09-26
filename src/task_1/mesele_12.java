package task_1;

import java.util.Scanner;

public class mesele_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Kalkulyator Menyusu ---");
        System.out.println("1 -> Toplama");
        System.out.println("2 -> Çıxma");
        System.out.println("3 -> Vurma");
        System.out.println("4 -> Bölmə");
        System.out.print("Seçiminizi edin (1-4): ");

        int secim = scanner.nextInt();

        switch (secim) {
            case 1:
                System.out.println("Toplama");
                break;
            case 2:
                System.out.println("Çıxma");
                break;
            case 3:
                System.out.println("Vurma");
                break;
            case 4:
                System.out.println("Bölmə");
                break;
            default:
                System.out.println("Yanlış seçim! (1-4 arasında ədəd daxil edin)");
                break;
        }

        scanner.close();
    }
}