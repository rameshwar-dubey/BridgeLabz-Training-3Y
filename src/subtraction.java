import java.util.Scanner;
public class subtraction {
    public static int sub(int a,int b){
        return a-b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sub(a, b);
        System.out.print(c);
    }
}
