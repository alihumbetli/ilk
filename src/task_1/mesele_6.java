package task_1;

import java.util.Scanner;

public class mesele_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci ədədi daxil edin: ");
        int a = scanner.nextInt();

        System.out.print("İkinci ədədi daxil edin: ");
        int b = scanner.nextInt();

        System.out.print("Üçüncü ədədi daxil edin: ");
        int c = scanner.nextInt();

        int enBoyuk = a;
        if (b > enBoyuk) {
            enBoyuk = b;
        }

        if (c > enBoyuk) {
            enBoyuk = c;
        }

        System.out.println("Ən böyük ədəd: " + enBoyuk);

        scanner.close();
    }
}