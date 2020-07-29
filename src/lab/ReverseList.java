package lab;

public class ReverseList {

    public static int[] reverse(int[] a) {

        int[] b = a.clone();
        for (int i = 0; i < a.length; i++) {
            b[i] = a[a.length - 1 - i];
        }

        return b;
    }

    public static void display(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static int[] recursivelyReverse(int[] arr){

        int[] a = new int[arr.length];
        util(arr, a, arr.length-1, 0);
        return a;
    }

    public static void util(int[] src, int[] dest, int src_index, int dest_index){

        // base case
        if(src_index == -1){
            return;
        }

        dest[dest_index] = src[src_index];
        util(src, dest, src_index-1, dest_index +1);

    }

    public static void main(String[] args) {
        int[] arr1 = new int[50];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i;
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        System.out.println("iterative approach");
        int[] res1 = reverse(arr1);
        display(res1);

        System.out.println("recursive approach");
        int[] res2 = recursivelyReverse(res1);
        display(res2);

    }


}
