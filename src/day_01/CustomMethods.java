package day_01;

public class CustomMethods {

    public static void main(String[] args) {

        String str1 = "Cybertek";

        String reversed1 = "";

        for (int i = str1.length()-1 ; i >=0 ; i--) {
        reversed1 += str1.charAt(i);
        }

        String str2 = "School";

        System.out.println(reverseOfWord(str2));

        String str3 = "Java";

        System.out.println(reverseOfWord(str3));

        String str4 = "anna";

        System.out.println(isPalindrome(str4));

    }

    public static String reverseOfWord(String word){
        String reversed = "";
        for (int i = word.length()-1 ; i >=0 ; i--) {
            reversed += word.charAt(i);
        }
        return reversed;
    }

    public static boolean isPalindrome(String word){
        String reverse = reverseOfWord(word);

        return word.equals(reverse);
    }
}
