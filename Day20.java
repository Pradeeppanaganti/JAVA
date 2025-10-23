// Practise Questions

// 1
/* import java.util.*;
public class Day20 {

    public static void countVowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                count++;
            }
        }
        System.out.println(count);

    }

    public static void main(String args[]) {
        String str = "Hi my name is pradeep and i am a software Engineer";
        countVowels(str);
    }
} */

// 2 Output => False True

// 3 Output => Apna Coege

// 4
// To check if two strings are anagram of each other 
/* 
import java.util.*;

public class Day20 {
    public static boolean Amagram(String str1 , String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }
        HashMap<Character, Integer> maps1 = new HashMap<>();
        HashMap<Character, Integer> maps2 = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            maps1.put(str1.charAt(i), maps1.getOrDefault(str1.charAt(i), 0) + 1);
            maps2.put(str2.charAt(i), maps2.getOrDefault(str2.charAt(i), 0) + 1);
        }
        return maps1.equals(maps2);
    }
    public static void main(String args[]) {
        String str1 = "listen";
        String str2 = "silentt";
        System.out.println(Amagram(str1, str2));
    }
} */

// intern()
// When you write:
// String s1 = "Java";
// This string "Java" goes into a special area in memory called the String Constant Pool (inside the method area).
// If "Java" already exists there, Java reuses the same one — no new object is made.

// But when you do:
// String s2 = new String("Java");
// You’re forcing Java to make a new object in the heap, even though "Java" already exists in the pool.

// So now:
// "Java" → in String Pool
// new String("Java") → in Heap

// Thus:
// s1 == s2  // false (different memory)

// 💡 Where intern() comes in

// If you now do:
// String s3 = s2.intern();
// Here’s what intern() does step by step:

// Looks for "Java" in the string pool.
// If found → returns the same pooled reference.
// If not found → adds it to the pool and returns that reference.

// So now:
// s3 == s1  // true (both from the pool)

// 🧩 Why it matters

// Saves memory → duplicates are avoided.

// Fast comparison → You can safely use == for interned strings.

// Common in compilers & frameworks → They often intern strings like keys or identifiers to save space.