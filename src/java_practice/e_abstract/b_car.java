package java_practice.e_abstract;

public class b_car extends a_vehicle{

    @Override
    public void speed() {
        System.out.println("Speed is 200km/hr");
    }

    public static void main(String[] args) {
        b_car car = new b_car();
        car.tyre();
        car.speed();

    }
}
