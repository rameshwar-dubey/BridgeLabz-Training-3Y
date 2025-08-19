package level1_practice_programe;
import java.sql.SQLOutput;
import java.util.*;
public class profitAndLoss {
    public static void main(String[] args){
        int cost_pr=129;
        int selling_pr=191;
        int profit=selling_pr-cost_pr;
        float profit_percentage=((float)profit/cost_pr)*100;
        System.out.println("The Cost Price is INR "+ cost_pr +" and Selling Price is INR "+ selling_pr);
        System.out.println("The Profit is INR "+ profit + " and the Profit Percentage is "+ profit_percentage);
    }
}
