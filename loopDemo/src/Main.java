public class Main {

    public static void main(String[] args) {
        //for
	for(int i=2;i<=10;i+=2){
	    System.out.println(i);
    }
	System.out.println("For döngüsü bitti");
	//while
        int i=1;
        while(i<=10){
            System.out.println(i);
            i=i+2;
        }
        System.out.println("While döngüsü bitti");
        //do-while
        int j=1;
        do {
            System.out.println(j);
            j += 2;
        }    while(j<10);
            System.out.println("Do-While döngüsü bitti");

    }
}
