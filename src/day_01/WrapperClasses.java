package day_01;

public class WrapperClasses {

    public static void main(String[] args) {

        byte b = 10;
        int i = b;

        Byte b2= 10;
        //Integer i2 = b; -->> we can not assign


        double d = 1;

        Double d2 = d;

        double d3= b2;

        String str1 = "123";

        int num1 = Integer.parseInt(str1);
        System.out.println("num1 = " + num1);

        System.out.println(str1+1);



    }
}
