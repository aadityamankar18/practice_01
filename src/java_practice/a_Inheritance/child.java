package java_practice.a_Inheritance;

public class child extends Father {
    public void Bike(){
        System.out.println("Hunter 350");
    }
    public static void main(String[] args) {
        child child = new child();
        child.Bike();
        child.House();
        child.farm();
    }
}
