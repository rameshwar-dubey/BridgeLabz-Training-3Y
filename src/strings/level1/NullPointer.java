package strings.level1;

public class NullPointer{
    public static void generateException() {
        String text = null;
        System.out.println(text.length()); // generates exception
    }

    public static void handleException() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch(NullPointerException e) {
            System.out.println("Handled NullPointerException");
        }
    }

    public static void main(String[] args) {
        handleException();
    }
}
