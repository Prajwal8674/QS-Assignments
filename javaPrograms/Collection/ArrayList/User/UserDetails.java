package Collection.ArrayList.User;

public class UserDetails implements Comparable<UserDetails>{

    int id;
    int amt;
    String name;
    String gifHamper;


    UserDetails(int id, String name,int amt){

        this.id=id;
        this.name=name;
        this.amt=amt;

    }

    @Override
    public int compareTo(UserDetails o) {
        //System.out.println(this.name+" "+" "+o.name);
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "UserDetails{" +
                "amt=" + amt +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}
