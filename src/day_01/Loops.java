package day_01;

public class Loops {


    public static void main(String[] args) {

        for (int i = 1 ; i<6 ;i++ ) { //-->> if there is no condition it will run infinitive
            System.out.println("Hello World");
        }


        System.out.println("=======================");

        String str = "hello";

        String reversed = "";

//        reversed += str.charAt( str.length()-1);

//        reversed += str.charAt(4);
//        reversed += str.charAt(3);
//        reversed += str.charAt(2);
//        reversed += str.charAt(1);
//        reversed += str.charAt(0);

        for (int i = str.length()-1 ; i>=0 ; i--){
            reversed += str.charAt(i);
        }

        System.out.println("reversed = " + reversed);

    }


}
