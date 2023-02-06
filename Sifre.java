import java.util.Scanner;
public class Sifre {
    public static void main(String[] args) {

        //Değişkenlerin tanımlanması işlemi.

        int sifre;
        boolean sifreSor = true;

        //Şifre girişi ve şifrenin karşılaştırma işlemi.

        do {
            Scanner input = new Scanner(System.in);

            System.out.print("Şifreyi giriniz: ");
            sifre = input.nextInt();

            if (sifre == 1234) {
                System.out.println("Şifreyi doğru girdiniz.Tebrik ederim.");
                sifreSor = false;
            } else {
                System.out.println("Yanlış şifre girdiniz!Lütfen tekrar deneyiniz.");
            }
        }
        while(sifreSor);
    }
}