package java_practice.b_polymorphism_CompileTime;

//over-loading

public class teacher {
    public void teacher (){
        System.out.println("Silent...");
    }
    public void teacher (String collage){
        System.out.println("Angry...");
    }
    public void teacher (int salary){
        System.out.println("Happy...");
    }

    public static void main(String[] args) {
        teacher teach = new teacher();
        teach.teacher();
        teach.teacher(20000);
        teach.teacher("10th Class");
    }
}
