import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir ədəd daxil edin: ");
        int eded = scanner.nextInt();
        if (eded % 2 == 0) {
            System.out.println(eded + " cüt ədəddir.");
        } else {
            System.out.println(eded + " tək ədəddir.");
        }
        scanner.close();
    }
}