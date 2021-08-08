package lesson4;

public class PrintFApp {



    public static void main(String[] args) {
        String formatString = "some string number = %d string = %s";
        {
            int a = 10;
            System.out.printf(formatString, 10, "abc");
            System.out.println();
            System.out.printf(formatString, 20, "abcdef");
        }
        //System.out.println(a);
    }
}
