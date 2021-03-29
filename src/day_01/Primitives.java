package day_01;

public class Primitives {

    public static void main(String[] args) {

    byte b = 10;
    short s = 10;
    int i = 10;
    long l = 10;

    //implicit casting
    int intNumbers = (int) b;

    //explicit casting, can happen data loss
    byte byteNumber = (byte) i;

    //cahr types can be assign to number
    char ch = 200;

        System.out.println("ch = " + ch);

        boolean r1= true;
        boolean r2= false;
        boolean r3= 10 > 9;

    }
}
