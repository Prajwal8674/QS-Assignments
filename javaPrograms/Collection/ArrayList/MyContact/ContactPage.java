package Collection.ArrayList.MyContact;

public class ContactPage {

    String name;
    String email;
    String relation;
    long phno;

    ContactPage(String name,long phno, String email, String relation){

        this.name=name;
        this.phno=phno;
        this.email=email;
        this.relation=relation;

    }

    @Override
    public String toString() {
        return "[" +
                " " + name +
                ", " + phno+
                ", " + email +
                ", " + relation +
                " ]";
    }
}
