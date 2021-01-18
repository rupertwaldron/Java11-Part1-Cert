package com.ruppyrup.strings;

public class StringCreation {

    public static void main(String[] args) {
        String str = new String();
        String str2 = new String(" World");
        String str3 = "Hello World!!!";
        String str4 = new String(new StringBuilder("sb"));
        byte[] bytes = new byte[] {0x48, 0x65, 0x6c, 0x6c, 0x6f};
        byte[] hexes = new byte[] {72, 101, 108, 108, 111};
        char[] chars = new char[] {'W', 'o', 'r', 'l', 'd'};
        System.out.println(new String(bytes) + str2);
        // + operator is overloaded so that if operands are strings they are concatenated
        System.out.println(new String(hexes) + " "+ new String(chars));
        String bob = "bob";
        //char c = bob[0]; // not allowed
        Object obj = null;
        String s4 = "hello " + obj; // prints hello null
        System.out.println(s4);

        String s = "1";
        s += 2;
        System.out.println(s); // "12"

//        int x = 1;
//        x += "2"; // wont compile because can't assign String to an int

        Object m = 1;
        m += "2";
        System.out.println(m); // "12"

        Object n = "hello";
        // n += 1; wont compile as neither opperand is of type String

        String str1 = "hello";
        String str5 = "hello";
        System.out.println(str1 == str5); // returns true as they point to the same object
        String str6 = new String("hello"); // creates two objects "hello" on String pool and one on the heap using the "new" keyword
        System.out.println(str1 == str6); // returns false as they point to different objects.
        // str6 is on the regular heap space
        String str7 = str6.intern(); // gets string reference from the String pool
        System.out.println(str1 == str7); // returns true

        String s1 = "ab";
        s1 += "cd"; // the reference now points to a new string. s1 wasn't mutated.
        System.out.println(s1);

        String s2 = null;
        System.out.println(s2);

        String rup = "Hello Rupert";
        int length = rup.length(); // returns length of string
        char c = rup.charAt(1); // returns e
        int index = rup.indexOf("p"); // returns 8
        // starting index is normally inclusive whereas the ending index is normally exclusive
        String sub = rup.substring(6); // returns Rup
        String concat = rup.concat("17"); // adds 17 on to string
        String up = rup.toUpperCase(); // uppercase
        String rep = rup.replace("up", "69");
        String strip = rup.strip();
        System.out.println(strip == rup); // returns true - same object
        // if trim, strip, stripLeading etc return the same string if there is no change -> same object
        // strip is Java11  and uses a better definition of white space than trim.
        System.out.println("  ".isBlank()); // returns true
        System.out.println("  ".isEmpty()); // returns false
        System.out.println("Rup".startsWith("R")); // returns true
        System.out.println("Rup".endsWith("p")); // returns true
        System.out.println("Rup".contains("up")); // returns true
        System.out.println("Rup".equals("Rup")); // true. true if contents are the same
        System.out.println("Rup".equalsIgnoreCase("ruP")); // true
        System.out.println("Rup" == "Rup"); // true
        System.out.println("Rup" == new String("Rup")); // false
        String s5 = null;
        "Rup".equals(s5); // this is better as "Rup" is an object that isn't null
        s5.equals("Rup"); // this could give a null pointer exception
    }

}
