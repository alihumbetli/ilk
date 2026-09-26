import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci ədədi daxil edin: ");
        int a = scanner.nextInt();

        System.out.print("İkinci ədədi daxil edin: ");
        int b = scanner.nextInt();

        System.out.print("Üçüncü ədədi daxil edin: ");
        int c = scanner.nextInt();

        int enBoyuk;

        if (a >= b && a >= c) {
            enBoyuk = a;
        }
        else if (b >= a && b >= c) {
            enBoyuk = b;
        }
        else {
            enBoyuk = c;
        }

        System.out.println("Ən böyük ədəd: " + enBoyuk);

        scanner.close();
    }
}