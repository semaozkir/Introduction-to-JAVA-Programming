public class Main {

    public static void main(String[] args) {
        int sayi = 19;
        if (sayi < 20) {
            System.out.println(sayi + " sayısı 20 den küçüktür");
        } else if (sayi == 19) {
            System.out.println("sayı 20'ye eşittir");
        } else {
            System.out.println("Sayı 20 den büyüktür");
        }

        int sayi1 = 10;
        int sayi2 = 40;
        int sayi3 = 30;
        int enBuyuk = sayi1;

        if (enBuyuk < sayi2) {
            enBuyuk = sayi2;
        }
        if (enBuyuk < sayi3) {
            enBuyuk = sayi3;
        }
        System.out.println("en büyük:" + enBuyuk);

        char grade='C';
        switch (grade){
            case'A':
                System.out.println("Mükemmel: Geçtiniz");
                break;
            case 'C':
                System.out.println("İyi: Geçtiniz");
                break;
            case'F':
                System.out.println("Maalesef: Kaldınız");
                break;
                default:
                    System.out.println("Geçersiz not girdiniz!");
        }

    }
}
