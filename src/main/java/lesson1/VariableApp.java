package lesson1;

public class VariableApp {

    public static void main(String[] args) {
        int a = 10;
        int b = 42;
        int c = a + b;
        c++; // c = c + 1
        c += 10; //c = c + 10

        System.out.println("Наше число " + c);

        String value = "Строка";

        System.out.println(value);

        value = value + " новая";
        System.out.println(value);

        myMethod();

        booleanCheck();
    }

    public static void anotherMethod() {
        System.out.println("another");
    }

    //camelCaseWriting
    public static void myMethod(){
        System.out.println("word");
        anotherMethod();
    }

    public static void booleanCheck() {
        int a = 10;
        int b = 11;
        boolean check = (a==b);
        if (check) {
            System.out.println("The same");
        } else if (a > 7) {
            System.out.println("Not the same");
        } else if (b > 8) {

        } else {

        }
    }




}
