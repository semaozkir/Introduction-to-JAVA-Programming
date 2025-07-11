import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Customer> customers=new ArrayList<Customer>();
        Customer michael=new Customer(1, "Michael","Scofield");
        customers.add(michael);
        customers.add(new Customer(2,"Sarah","Scofield"));

        customers.remove(michael);
        for(Customer customer:customers){
            System.out.println(customer.firstName);
        }
    }
}
