package Patryk.company;


public class FlippingBits {

    public long flippingBits(long n) {
        System.out.println(Long.toString((long) (Math.pow(2,32)-1)));
        System.out.println(Long.toString(((long) (Math.pow(2,32)-1)), 2));
        System.out.println(Long.toString(((long) (Math.pow(2,32)-1)), 16));
        System.out.println(Long.toString(((long) (Math.pow(2,32)-1)), 8));
        long result = (long)Math.pow(2,32)-1;
        System.out.println(result^n);
        return result^n;
    }

}
