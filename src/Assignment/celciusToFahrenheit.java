package Assignment;
import java.util.*;
public class celciusToFahrenheit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int celc=sc.nextInt();
        int feh=(celc*(9/8))+32;
        System.out.print("fehrenheit"+ feh);
    }
}
