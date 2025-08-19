package level1_practice_programe;

public class discount {
    public static void main(String[] args){
        int fees=125000;
        int discountPercent=10;
        int discountedAmount=125000/10;
        int payAmount=fees-discountedAmount;
        System.out.println("The discount amount is INR "+ discountedAmount +" and final discounted fee is INR "+payAmount);
    }
}
