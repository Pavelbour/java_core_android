package core.android.lesson.one;

public class Main {
    public static void main(String[] args) {
        System.out.println("method #1 " + met1(8, 1, 4,4) + "");
        System.out.println("==========================================");
        System.out.println();

        System.out.println("method #2 " + met2(8, 7) + "\n");
        System.out.println("==========================================");
        System.out.println();

        met3(5);
        System.out.println("==========================================");
        System.out.println();

        System.out.println("method #4 " + met4(-8));
        System.out.println("==========================================");
        System.out.println();

        met5("Marie-Helene");
        System.out.println("==========================================");
        System.out.println();

        met6(1956);
        met6(2000);
        met6(2100);
    }

    public static float met1(float a, float b, float c, float d) {
        return a * (b + (c/d));
    }

    public static boolean met2(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void met3(int a) {
        if (a < 0) {
            System.out.println("The number " + a + " is below zero.");
        } else {
            System.out.println("The number " + a + " is above zero.");
        }
    }

    public static boolean met4(int a) {
        return a < 0;
    }

    public static void met5(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void met6(int year) {
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("The year " + year + " is intercalary");
        } else {
            System.out.println("The year " + year + " isn't intercalary");
        }
    }
}
