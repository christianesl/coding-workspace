public class Loops {

    public static void main(String[] args)   {
        int x = 0;

        while (x++ < 10) {
            System.out.println("value: " + x);
        }

        x = 0;
        while (++x < 10) {
            System.out.println("value: " + x);
        }

        int y = 0;
        if (y++ < 1) {
            System.out.println("value of y: " + y);
        }
        y = 0;
        if (++y < 1) {
            System.out.println("value of y: " + y);
        } else {
            System.out.println("else y: " + y);
        }

        System.out.println("a " + (int) ('a'));
        System.out.println("z " + (int) ('z'));

        String c1 = "{";
        String c2 = "'";

        System.out.println("comparison: " + c1.compareTo(c2));
    }

}
