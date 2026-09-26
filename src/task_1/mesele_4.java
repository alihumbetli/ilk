package task_1;

import java.util.Scanner;

public class mesele_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Selsi dərəcəsini daxil edin (°C): ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9.0 / 5.0) + 32;

        System.out.println("Fahrenheit dərəcəsi (°F): " + fahrenheit);

        scanner.close();
    }
}