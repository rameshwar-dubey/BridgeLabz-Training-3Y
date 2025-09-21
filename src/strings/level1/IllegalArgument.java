package strings.level1;

public class IllegalArgument {
    public static void handleException(String s) {
        try {
            System.out.println(s.substring(3,1));
        } catch(IllegalArgumentException e) {
            System.out.println("Handled IllegalArgumentException");
        } catch(Exception e) {
            System.out.println("Handled generic exception");
        }
    }

    public static void main(String[] args) {
        handleException("hello");
    }
}
