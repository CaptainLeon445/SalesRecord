import java.util.Scanner;
import java.text.*;

public class SalesRecord{
    public static void main(String[] args){
        System.out.println("Enter the opening price: ");
        Scanner sc = new Scanner(System.in);
        double openingPrice = sc.nextDouble();
        int day = 1;
        DecimalFormat df = new DecimalFormat("0.00");

        while(true){
        System.out.println("Enter the closing price for day "  + day  + ". App will close if negative value is passed.");
        double closingPrice = sc.nextDouble();
        if (closingPrice < 0.0) break;
        double earning = closingPrice - openingPrice;
        if (earning > 0.0){
            System.out.println("You made profit of " + df.format(earning) + " on day " + day);
        }else if (earning < 0.0){
            System.out.println("You made loss of " + df.format(earning) + " on day " + day);
        }else{
            System.out.println("You made no sales on day " + day );
        }
        day +=1;
        }
    }
}