public class Increments {

    public static void incrementBefore(int a){
        System.out.println("before: " + (--a));
        System.out.println("before: " + (a));
    }

    public static void incrementAfter(int a){
        System.out.println("after: " + (a--));
        System.out.println("after: " + (a));
    }

    public static void main(String[] args){
        int a = 23;

        System.out.println("Original " + a);
        incrementAfter(a);
        incrementBefore(a);
        System.out.println("Original " + a);
    }

}
