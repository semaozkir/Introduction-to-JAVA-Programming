import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
		ArrayList sayilar= new ArrayList();
		sayilar.add(1);
		sayilar.add(10);
		sayilar.add("Ankara");
		//System.out.println(sayilar.size());
		//sayilar.set(0,5);
		//System.out.println(sayilar.get(1));
		//sayilar.remove(0);
		//sayilar.clear();
		//System.out.println(sayilar.get(1));
		for(Object i:sayilar){
			System.out.println(i);
		}
    }
}
