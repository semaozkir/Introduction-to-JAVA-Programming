public class Main {

    public static void main(String[] args) {
        String mesaj="Bugün hava çok güzel.";
        String yeniMesaj=mesaj.substring(0,2);
        System.out.println(yeniMesaj);
        String sehir=sehirVer();
        System.out.println(sehir);
        int sayi=topla(31,8);
        System.out.println(sayi);
        int toplam=topla2(10,11,5,15,13,7);
        System.out.println(toplam);
    }
    public static int topla(int sayi1,int sayi2){
        return sayi1+sayi2;
    }
    public static String sehirVer(){
        return "Ankara";
    }
    public static int topla2(int... sayilar){
        int top=0;
        for(int sayi:sayilar){
            top=top+sayi;
        }
        return top;
    }
}
