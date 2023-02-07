package LAB2;
import java.util.*;
public class LAB029 {
    public static void main(String[] args) {
        double salary;
        Scanner tube = new Scanner(System.in);
        System.out.print("Enter your salary: ");
        salary = tube.nextDouble();
        if(salary > 50000){
            System.out.println(salary*0.1);
        } else {
            System.out.println(salary * 0.5);
        }
    }
}