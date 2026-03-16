package java_practice.a_Inheritance;


public class Father extends grandfather {

    public void House(){
        System.out.println("4400 sq. ft. Home");
    }
    public static void main(String[] args) {
        Father father = new Father();
        father.farm();
        father.House();
    }

}
