package java_practice.e_abstract;

public class c_truck extends a_vehicle {

    @Override
    public void speed() {
        System.out.println("Speed is 80km/hr");
    }

    public static void main(String[] args) {
        c_truck truck = new c_truck();
        truck.tyre();
        truck.speed();
    }
}
