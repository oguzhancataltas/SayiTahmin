import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int number = random.nextInt(100);

        int right = 0;
        int guess;


        System.out.println("Sayı Tahmin Oyununna Hoşgeldiniz...");
        System.out.println("Toplam 5 Tahmin Hakkınız Bulunmaktadır.");
        System.out.println("0 - 100 Arasında Bir Sayıyı Tahmin Etmeye Çalışın.");

        while (right < 5) {

            System.out.print((right + 1) + ". Tahmininizi Giriniz : ");
            guess = scanner.nextInt();

            if (guess < 0 || guess > 99) {
                System.out.println("Lütfen 0 - 100 arasında bir tahminde bulunun!!!");
                continue;
            }

            if (guess == number) {
                System.out.println("Doğru Tahminde Bulundunuz !!!");
                System.out.println("Tahmin ettiğiniz Sayı : " + number);
                break;
            } else {
                System.out.println("Yanlış Tahmin!!!");
                System.out.println("Kalan Hakkınız : " + (5 - ++right));
                if (guess < number) {
                    System.out.println("İpucu : " + guess + " sayısı gizli sayıdan daha küçük.");
                } else {
                    System.out.println("İpucu : " + guess + " sayısı gizli sayıdan daha büyük.");
                }
            }
        }

        if (right == 5) {
            System.out.println("Kaybettiniz!!!");
            System.out.println("Gizli Sayı : " + number);
        }

    }
}
