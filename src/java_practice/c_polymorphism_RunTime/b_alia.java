package java_practice.c_polymorphism_RunTime;

// over-riding

public class b_alia extends a_Deepika{
    public void marry(){
        System.out.println("Marry with Alia");
    }
    public static void main(String[] args) {
        b_alia alia = new b_alia();
        alia.marry();
    }

}
