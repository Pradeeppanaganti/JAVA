
// STRING FUNCTIONS 

//Compare

/* public class Day19 {
    public static void main(String args[]) {
        String str = "Pradeep";
        String str1 = "Pradeep";
        String str2 = new String("Pradeep");

        // if(str == str1) {
        //     System.out.println("The Strings match");
        // }
        // else {
        //     System.out.println("The Strings doesn't match");
        // }

        if(str.equals(str2)) {
            System.out.println("The Strings are equal");
        }
        else{
            System.out.println("The strings are not equal");
        }
    }
} */


//Substring
/* 
//Manually implementing it
import java.util.Scanner;
public class Day18 {
    public static String subString(String str,int si,int ei){
        String subStr = "";
        for(int i = si; i < ei;i++) {
            subStr += str.charAt(i);
        }
        return subStr;
    }
    public static void main(String args[]) {
        String str = "HelloWorld";
        Scanner sc = new Scanner(System.in);
        int si = sc.nextInt();
        int ei = sc.nextInt();
        System.out.println(subString(str,si,ei));
    }
} 
 */

//Built in Function
/* 
    private static void greatest(String[] fruits) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
*/
/* 
public class Day18 {
    public static void main(String args[]) {
        String str = "Hello World!!";
        System.out.println(str.substring(0,5));
    }
} */

/* public class Day19 {
    public static void greatest(String fruits[]) {
        String largest = fruits[0];
        for(int i = 0; i < fruits.length ; i++) {
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
    
    public static void main(String args[]) {
        String fruits[]= {"apple","mango","banana"};
        greatest(fruits);
    }
} */

// string.equals(string1)
// string.substring(si,ei)
// string.compareTo(string2)

// String Builder
/* 
public class Day19 {
    public static void main(String args[]) {
        StringBuilder Alphabets = new StringBuilder("");

        for(char i = 'a'; i <= 'z' ; i++) {
            Alphabets.append(i);
        }

        System.out.println(Alphabets);
    }
} */

// Changing the first letter of words in the sentence to Capital
/* 
import java.util.*;
public class Day19 {
    public static String toUpperCase(String str) {
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i = 1;i < str.length(); i++) {

            if(str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String args[]) {
        String str = "hi, i am pradeep";
        System.out.println(toUpperCase(str));
    }
} */

//String Compression
/* 
public class Day19 {
    public static String stringCompression(String str) {
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count > 1) {
                sb.append(count.toString());
            }
        }
        return sb.toString();
    }
    public static void main(String args[]) {
        String str = "aaabbbccc";
        System.out.println(stringCompression(str));
    }
} */

