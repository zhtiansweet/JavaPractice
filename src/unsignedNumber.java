/**
 * Created by tianzhang on 5/21/15.
 */


public class unsignedNumber {
    public static void main(String[] args) {
        int x = 5;
        int y = -2;
        long z = -2l;

        integralType.print("x =", x);
        integralType.print("y =", y);
        integralType.print("z =", z);
        integralType.print("(unsigned) y =", Integer.toUnsignedLong(y));
        System.out.println(Integer.toUnsignedString(y));
        System.out.println(Long.toUnsignedString(z));
        System.out.println(Integer.compare(x, y));
        System.out.println(Integer.compareUnsigned(x, y));
        System.out.println(Integer.divideUnsigned(x, y));
        System.out.println(x/y);

    }

    public static boolean compare(int x, int y){
        return true;
    }
}
