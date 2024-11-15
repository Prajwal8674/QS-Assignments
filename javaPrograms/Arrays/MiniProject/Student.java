package Arrays.MiniProject;

public class Student {

    int id;
    char gender;
    String name;
    String college;
    double percent;
    int yop;

    //Student(){}

    public Student(int id, String name, char gender,  String college ,double percent, int yop){

        this.id=id;
        this.name=name;
        this.gender=gender;
        this.college=college;
        this.percent=percent;
        this.yop=yop;
    }

    @Override
    public String toString() {
        return "[ " +
                "college = '" + college + '\'' +
                ", id = " + id +
                ", gender = " + gender +
                ", name = '" + name + '\'' +
                ", percent = " + percent +
                ", yop = " + yop +
                ']';
    }
}
