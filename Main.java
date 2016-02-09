/**
 * Created by 123 on 08.02.2016.
 */
public class Main {
    public static void main(String[] args) {

        assertMethod(0, 5);
        assertMethod(10, 15);
        assertMethod(-10, 5);
    }

    private static void assertMethod(int input, int expected) {
        int adder = adder(input);
        if (adder == expected) {
            System.out.println("OK");
        } else {
            System.out.println(" expected: " + expected + " calculated: " + adder);
        }
    }

    protected static int adder(int figure) {
        return figure + 5;
    }

}

