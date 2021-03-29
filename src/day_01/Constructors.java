package day_01;


class Student{
    public String name, gender;
    public int age;

    public Student(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {

        Student student1 = new Student("Martin", "Male", 34);

        System.out.println("student1 = " + student1);

        System.out.println("After change the name");

        student1.name = "Hans";

        System.out.println("student1 = " + student1);

        Student student2 = new Student("Jessica", "Female", 45);

        System.out.println("student2 = " + student2);
    }

}

public class Constructors {

    int a;

    public Constructors(){
        System.out.println("default");
    }


    //overloading constructor with different parameters
    public Constructors(int a){
        this(); //--->>>to chain constructors
        this.a = a;
        System.out.println("integer = "+a);
    }

    public Constructors(String s){ //one constructor can call one one other
        this(5);//to chain constructors
        System.out.println("String = "+s);
    }


    public static void main(String[] args) {

        new Constructors().method1();
        new Constructors().method2();

        Constructors obj = new Constructors();

        obj.method1();
        obj.method2();

        System.out.println("-------------");

    }

    public void method1(){
        System.out.println("Hello");
    }

    public void method2(){
        System.out.println("How are you?");
    }

}
