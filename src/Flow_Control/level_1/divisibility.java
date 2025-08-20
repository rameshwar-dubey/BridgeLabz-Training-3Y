package Flow_Control.level_1;
import java.util.*;

public class divisibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        if(num%5==0) System.out.printf("the number %d is divisible by 5 \n",num);
        else System.out.printf("the number %d is not divisible by 5 \n",num);
    }
}
