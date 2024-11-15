package Arrays.MiniProject;

public class Student {

    int id;
    char gender;
    String name;
   public int age;
    String college;
    double percent;
    int yop;

    Student(){}

    public Student(int id, String name, int age, char gender,  String college ,double percent, int yop){

        this.id=id;
        this.name=name;
        this.gender=gender;
        this.age=age;
        this.college=college;
        this.percent=percent;
        this.yop=yop;
    }

    public void displayData(){
        System.out.println("ID : " + id);
        System.out.println("ID : " + id);
        System.out.println("ID : " + id);
        System.out.println("ID : " + id);
        System.out.println("ID : " + id);
        System.out.println("ID : " + id);



    }
    public void sortByAge(){

    }
    @Override
    public String toString() {
        return "[ " +
                "id = '" + id + '\'' +
                ", name = " + name +
                ", age = " + age +
                ", gender = " + gender +
                ", college = '" + college + '\'' +
                ", percent = " + percent +
                ", yop = " + yop +
                ']';
    }
}
