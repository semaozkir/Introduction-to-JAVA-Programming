import Matematik.DortIslem;
import Matematik.Logaritma;  //import Matematik.*;  ile tüm matematik paketini import ederiz.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adınız:");
        String isim = scanner.nextLine();
        System.out.println("Merhaba " + isim);

        DortIslem dortIslem = new DortIslem();
        dortIslem.topla(2, 3);
        Logaritma logaritma = new Logaritma();
    }
}
