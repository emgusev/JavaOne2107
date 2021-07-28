package lesson2;

public class TrainApp {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static boolean isSummOfIntsInRage(int a, int b, int leftRange, int rightRange) {
        return true;
    }


    // Не надо так делять. Позязя
    public static boolean isTrueOrFalse(int a, int b, int c, int d) {
        return false;
    }

    public static boolean isPositive(int n) {
        if (n >= 0) {
            return true;
        }
        return false;
    }
}
