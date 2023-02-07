package LAB2;
import java.util.*;
public class LAB0211 {
    public static void main (String[] args){
        int money;
        String type;
        Scanner sc = new Scanner (System.in);
        System.out.print("Input your money : ");
        money = sc.nextInt();
        System.out.print("Input your account type(Please type A B C or X in uppercase) : ");
        type = sc.next();
        if (type.equals("A"))
            money += (money * 0.015);
        else if (type.equals("B"))
            money += (money * 0.02);
        else if (type.equals("C"))
            money += (money * 0.015);
        else if (type.equals("X"))
            money += (money * 0.05);
        System.out.print("Your total money in one year = "+ money);
            
            
    }
    
    
}
