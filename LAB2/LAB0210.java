package Lab2;
import java.util.*; 
public class LAB0210 {
    public static void main (String[] args) {
        String name;
        int salary = 0 ,weight, age, numDay1, numDay2;
        Scanner sc = new Scanner (System .in);
        Scanner tube = new Scanner (System .in);
        System.out.print("Please insert your name :  ");
        name = sc.nextLine();
        System.out.print("Please insert your age :   ");
         age = tube.nextInt();
        System.out.print("Please insert number of working days :  ");
         numDay1 = tube.nextInt();
        System.out.print("Please insert number of absent days :  ");
         numDay2 = sc.nextInt();
        System.out.print("Please insert your body weight :  ");
         weight = tube.nextInt();
        System.out.println("Hi, " + name);
        if (age >= 21 && age <= 30)
            salary = (numDay1 * 300) - (numDay2 * 50);
        else if (age >= 31 && age <= 40)
            salary = (numDay1 * 500) - (numDay2 * 50);
        else if (age >= 41 && age <= 50)
            salary = (numDay1 * 1000) - (numDay2 * 25);
        else if (age >= 21 && age <= 30)
            salary = (numDay1 * 3000);
        System.out.println("Your salary is " + salary + " baht");
        if (weight >= 10 && weight <= 60 )
            salary += 5000;
        else if (weight >= 61 && weight <= 90)
            salary += 5000;
        System.out.println("Your salary and bonus is " + salary + " baht");
        
        
    }
    
}
