package java_practice;

public class b_dataTypes {
    //primitive data types
    public static void main(String[] args) {
        //integral numbers
        byte B = 127; // 1 byte, range: -128 to 127
        short s = 32767; // 2 bytes, range: -32,768 to 32,767
        int i = 2147483647; // 4 bytes, range: -2,147,483,648 to 2,147,483,647
        long l = 9223372036854775807L; // 8 bytes, range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

//        System.out.println(Byte.MAX_VALUE);
//        System.out.println(Byte.MIN_VALUE);

        //decimal numbers
        float F = 3.141592653589793f; // 4 bytes, range: approximately ±1.4E-45 to ±3.4028235E38
        double D = 3.141592653589793; // 8 bytes, range: approximately ±4.9E-324 to ±1.7976931348623157E308

//        System.out.println(f);
//        System.out.println(d);

        //character
        char initial = 'A'; // 2 bytes, range: 0 to 65535 (Unicode characters)
        System.out.println((int) initial);
        System.out.println((int) Character.MIN_VALUE);
        System.out.println((int) Character.MAX_VALUE);
        char heartShape = 10084;
        System.out.println(heartShape);
        char heart = '\u2764';    // Unicode representation for '❤'
        System.out.println(heart);
        char hindiChar = 2309;
        System.out.println(hindiChar);

        //65535 Unicode's you can use in char data type.

        //boolean
        boolean isJavaFun = true; // 1 byte, values: true or false
        boolean isFishTasty = false; // 1 byte, values: true or false


        //Widening and Narrowing // implicit and explicit type casting //Automatic conversion
        byte x = 10;  // 1 byte
        short y = x;  // 2 bytes
        int a = x;   // 4 bytes.
        long b = x;   // 8 bytes
        float c = x;   //4 bytes.
        double d = x;   // 8 bytes.
        System.out.println(x);
        System.out.println(y);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        float f = 1.7f;
        int g = (int)f;
        System.out.println(g);

        //Binary representation of numbers
        System.out.println(Integer.toBinaryString(23232));


    }
}
