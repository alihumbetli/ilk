import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Məbləği daxil edin: ");
        double mebleg = scanner.nextDouble();
        System.out.print("Faiz dərəcəsini daxil edin (%): ");
        double faizDerecesi = scanner.nextDouble();
        double faizMeblegi = (mebleg * faizDerecesi) / 100;
        System.out.println("Hesablanan faiz məbləği: " + faizMeblegi);

        scanner.close();
    }
}