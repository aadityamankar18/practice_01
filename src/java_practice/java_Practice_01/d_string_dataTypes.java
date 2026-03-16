package java_practice.java_Practice_01;

public class d_string_dataTypes {
    public static void main(String[] args) {
        String a = new String("Ram");
        String b = new String("Ram");
        String c = "Ram";
        String d = "Ram";
        System.out.println(a == b); // false, because a and b reference different objects in memory
        System.out.println(c == d); // true, because c and d reference the same string literal in the string pool
        System.out.println(a.equals(b)); // true, because a and b have the same content

    }
}
