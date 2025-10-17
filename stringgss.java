// Class Notes
/* 
import java.util.*;
public class stringgss {

    public static void main(String args[]) {
        // Def Char Array
        char arr [] = {'a','b','c','d'};

        //Def String
        String alphabet = "abcd";

        //Strings are Immutable

        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.nextLine();
        // System.out.println(name);

        String fullName = "Tony Stark";
        System.out.println(fullName.length());
    }
} */ 
/* 
import java.util.*;
public class stringgss {
    public static void printString(String str) {

        for(int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
    }
    public static void main(String args[]){
        char alphabets [] = {'a','b','c','d','e'};
        String str = "abcde";
        String str1 = "fghij";

        //Length of string -> String str.length();
        System.out.println(str + str1);
        System.out.println(str.length());
        printString(str);
    }
} */

// Palindrome or Not

// import java.util.*;

public class stringgss {
    public static boolean palindrome(String str) {

        for(int i = 0; i < str.length()/2;i++) {
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-1-i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]) {
        String word = "madam";
        System.out.println(word + " is palindrome: " + palindrome(word));
        
        String word2 = "hello";
        System.out.println(word2 + " is palindrome: " + palindrome(word2));
    }
}