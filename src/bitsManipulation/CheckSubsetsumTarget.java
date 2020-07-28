/****************************************************
 * Given N numbers. Check if there is a subset of them
 * with the sum equals to target value S.
 ****************************************************/

public class CheckSubsetsumTarget {

    public static void checkSubsetSum(int[] arr, int s){
        int n = arr.length-1;
        for(int mask = 0; mask <(1<<n); mask++){
            long sum = 0;
            for(int i = 0; i < n; i++){
                if((mask & (1 << i)) != 0 ){
                    sum += arr[i];
                }
            }

            if(sum == s){
                System.out.println("yes");
                return;
            }

        }
        System.out.println("no");
    }

    public static void main(String[] args){
        int[] arr = new int[20];
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int) (Math.random() * 55);
            System.out.print(" " + arr[i]);
        }

        int s = (int) (Math.random() * 30);
        System.out.println("\ntarget sum: " + s + "\nResult:");
        checkSubsetSum(arr, s);
    }

}
