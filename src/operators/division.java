import java.util.Scanner;
public class division {
    public static int div(int a,int b){
        return a/b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = div(a, b);
        System.out.print(c);
    }
}
