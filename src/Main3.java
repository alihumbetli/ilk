import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== ÖĞRENCİ NOT SİSTEMİ ===");
        System.out.print("Öğrenci Adını Girin: ");
        String ogrenciAdi = scanner.nextLine();

        System.out.print("Vize Notunu Girin (0-100): ");
        double vize = scanner.nextDouble();

        System.out.print("Final Notunu Girin (0-100): ");
        double fin = scanner.nextDouble();

        // Ortak ortalama hesabı (%40 Vize + %60 Final)
        double ortalama = (vize * 0.40) + (fin * 0.60);

        System.out.println("\n-----------------------------");
        System.out.println("Öğrenci: " + ogrenciAdi);
        System.out.println("Ortalama Notu: " + ortalama);

        // Harf Notu Hesabı
        char harfNotu;
        if (ortalama >= 90) {
            harfNotu = 'A';
        } else if (ortalama >= 80) {
            harfNotu = 'B';
        } else if (ortalama >= 70) {
            harfNotu = 'C';
        } else if (ortalama >= 60) {
            harfNotu = 'D';
        } else {
            harfNotu = 'F';
        }

        System.out.println("Harf Notu: " + harfNotu);

        // Durum Kontrolü
        if (ortalama >= 60) {
            System.out.println("Durum: Trikle Geçti! (Tebrikler)");
        } else {
            System.out.println("Durum: Kaldı! (Daha çok çalışmalısın)");
        }
        System.out.println("-----------------------------");

        scanner.close();
    }
}