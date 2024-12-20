package Collection.ArrayList.Student;

public class Student {
    String name;
    float perc;
    int yop;
    String branch;

    Student( String name, float perc, int yop, String branch){

        this.name=name;
        this.perc=perc;
        this.yop=yop;
        this.branch=branch;

    }

    @Override
    public String toString() {
        return "Student{" +
                "branch='" + branch + '\'' +
                ", name='" + name + '\'' +
                ", perc=" + perc +
                ", yop=" + yop +
                '}';
    }
}
