public class BitsLab {

    public static String binaryString(int number) {

        if(number == 0) return "0";
        StringBuilder sb = new StringBuilder();
        for (int i = number; i > 0; i /= 2) sb.append(i % 2);
        return sb.reverse().toString();
    }

    public static int getDecimal(String binary) {

        if(binary.length() > 32){
            System.out.println("out of bound.");
            return 0;
        }

        int bin = 0;
        int index = binary.length()-1;
        for (int i = 0; i < binary.length()  ; i++) {
            if (binary.charAt(i) == '1') {
                bin |= (1 << index);
            }
            index--;
        }
        return bin;
    }

    public static int getNext(int number) {
        // input validation
        if (number < 0) return -1;

        int complement = (~number + 1);
        int and = number & complement;
        int add = number + and;

        return add;

    }

    public static int getNextAlt(int number) {
        return number + (number & -number);
    }


    public static void main(String[] args) {

        int binary = 15;

        System.out.println("getNext() " + getNext(binary));
        System.out.println("-number " + (-5));
        System.out.println("getNextAlt() " + getNextAlt(binary));


        for(int num = 0; num < 15; num++){
            String tmp = binaryString(num);
            System.out.println("binary representation " + tmp);
            System.out.println("get decimal " + getDecimal(tmp));
        }
    }
}
