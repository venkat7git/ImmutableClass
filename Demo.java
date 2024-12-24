import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Demo {
    public static void main(String ar[]){

        
        Date date = new Date();

        List<String> addresses = new ArrayList<>();
        addresses.add("church street , bangolure, karnataka");
        addresses.add("temple street , kochi , kerala");
        Immutable obj = new Immutable("Rohith", "3434hdkfj3", date, addresses);

        System.out.println("name: "+obj.getName());
        System.out.println("id: "+obj.getId());
        System.out.println("Date: "+obj.getDate());
        System.out.println("Address: "+obj.getAddress());
    }
}

