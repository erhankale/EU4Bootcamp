package day_01;

class Person{

    public static String name, gender; //-->>Static belongs to the class,
                                       //-->>so every object from this class have same name


    public Person(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    @Override
    public String toString(){
        return name +" "+gender;
    }
}

public class ClassAndObject {

    public static void main(String[] args) {

        Person person1 = new Person("Daniel", "Male"); //Daniel
        System.out.println("person1 = " + person1.toString());
        Person person2 = new Person("Conor", "Male"); //Conor
        System.out.println("person2 = " + person2.toString());
        Person person3 = new Person("Breanna", "Female"); //John
        System.out.println("person3 = " + person3.toString());

        //Because of static attributes all objects are the same
        System.out.println("person1 = " + person1.toString()+" "+
                "person2 = " + person2.toString()+" "+
                "person3 = " + person3.toString());


    }
}

class Test{

    int a;
    static int b;

    public static void main(String[] args) {

        Test test1 = new Test();
        test1.a = 3;
        test1.b = 10;
        Test test2 = new Test();
        test2.a = 8;
        test2.b = 20;

        System.out.println("test1.b = " + test1.b);
        System.out.println("test2.b = " + test2.b);
        System.out.println("test1.a = " + test1.a);
        System.out.println("test2.a = " + test2.a);

    }
}
