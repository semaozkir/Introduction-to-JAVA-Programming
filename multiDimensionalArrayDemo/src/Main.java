public class Main {

    public static void main(String[] args) {
        String[][] sehirler = new String[3][3];
        sehirler[0][0] = "İstanbul";
        sehirler[0][1] = "Tekirdağ";
        sehirler[0][2] = "Kocaeli";
        sehirler[1][0] = "Trabzon";
        sehirler[1][1] = "Zonguldak";
        sehirler[1][2] = "Samsun";
        sehirler[2][0] = "Çanakkale";
        sehirler[2][1] = "Balıkesir";
        sehirler[2][2] = "İzmir";

        for (int i = 0; i <= 2; i++) {
            System.out.println("--------------------");
            for (int j = 0; j <= 2; j++) {
                System.out.println(sehirler[i][j]);
            }
        }


    }
}
