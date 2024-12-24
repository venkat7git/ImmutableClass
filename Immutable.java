import java.util.List;
import java.util.Date;

public final class Immutable {
    public final String name;
    public final String id;
    public final Date dateOfJoining;
    public final List<String> addresses;

    public Immutable(String name , String id , Date dateOfJoining, List<String> addresses){
        this.name = name;
        this.id = id;
        this.dateOfJoining = dateOfJoining;
        this.addresses = addresses;
    }


    public String getName(){
        return name;
    }
    public String getId(){
        return id;
    }
    public Date getDate(){
        return new Date(dateOfJoining.getTime());
    }
    public List<String> getAddress(){
        return addresses;
    }
}
