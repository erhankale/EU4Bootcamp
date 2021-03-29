package day_01;

public class CharSequencesReview {

    public static void main(String[] args) {

        String str1 = "Cybertek";
        String str2 = new String("Cybertek");

        str1 = str1.concat(" School"); //-->> new object "Cybertek School"

        str2.concat(" School"); //-->> new object "Cybertek School"

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);


        System.out.println("==========================");

        StringBuilder stringBuilder = new StringBuilder("Cybertek");

        stringBuilder.append(" School");

        System.out.println(stringBuilder);

        stringBuilder.reverse();

        System.out.println(stringBuilder);
        
        
        StringBuffer stringBuffer = new StringBuffer("Cybertek");

        stringBuffer.append(" School");

        System.out.println("stringBuffer = " + stringBuffer);

        //StringBuffer is created for synchronized thread-safe ==>> one thread at a time
        //thread:
    }
}
