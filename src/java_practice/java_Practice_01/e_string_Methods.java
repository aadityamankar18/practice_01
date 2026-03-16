package java_practice.java_Practice_01;

public class e_string_Methods {
    public static void main(String[] args) {
        String name = "Aaditya";
        int length = name.length();
        System.out.println(name.charAt(2)); // prints 'd'
//        ------------------------------------------------


//        int n = 0;
//        for (int i = 0; i<name.length(); i++){
//            if (name.charAt(i) == 'a' || name.charAt(i) == 'A'){
//                n++;
//            }
//            System.out.println(n);


//        ------------------------------------------------

        String name2 = "AaditYa";
//        System.out.println(name.equals(name2)); // true, because name and name2 have the same content
//        System.out.println(name.equalsIgnoreCase(name2));

//        ------------------------------------------------

        String str1 = "remote";
        String str2 = "car";

        int i = str1.compareTo(str2);  // compares str1 and str2 lexicographically and returns a negative integer because "remote" comes before "car" in alphabetical order
        System.out.println(i);

        String m = "      Aaditya Mankar";
        String subString = m.substring(1, 7);
        String upper = m.toUpperCase();
        String lower = m.toLowerCase();
        String trim = m.trim();
        System.out.println(subString); // prints "aditya"
        System.out.println(upper);
        System.out.println(lower);
        System.out.println(trim);






    }
}








