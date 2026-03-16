package java_practice.f_interface;
import java.util.Scanner;

public class b_logicClass implements a_logicPage {

    String name;
    String password;

    public void input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = scan.nextLine();
        System.out.println("Enter your password: ");
        password = scan.nextLine();

    }

    public void output() {
        System.out.println("Logic Successfully Completed");

    }

    public static void main(String[] args) {
        b_logicClass logic = new b_logicClass();
        logic.input();
        logic.output();
    }
}