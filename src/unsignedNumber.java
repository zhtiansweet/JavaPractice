/**
 * Created by tianzhang on 5/21/15.
 */


public class UnsignedNumber {
    public static void main(String[] args) {
        int x = 5;
        int y = -2;
        int a = 0b11111111111111111111111111111110;
        int b = 0xFFFFFFFE;
        String s = "11111111111111111111111111111110";
        String s1 = "FFFFFFFE";
        long z = -2l;
        long k = 0xFFFFFFFEl;

        IntegralType.print("x =", x);
        IntegralType.print("y =", y);
        IntegralType.print("(unsigned) y =", Integer.toUnsignedLong(y));
        IntegralType.print("z =", z);
        System.out.println("(unsigned) z =" + Long.toBinaryString(z) + " = " + Long.toUnsignedString(z));
        System.out.println();


        IntegralType.print("y =", Integer.parseInt("-2"));
        IntegralType.print("y =", Integer.parseInt("-10", 2));
        //IntegralType.print("y =", Integer.parseInt(s1, 16));
        //IntegralType.print("y = ", Integer.parseUnsignedInt("-2"));
        IntegralType.print("y =", -Integer.parseUnsignedInt("2"));
        //IntegralType.print("y =", Integer.parseUnsignedInt("-10", 2));
        IntegralType.print("y =", Integer.parseUnsignedInt(s, 2));
        System.out.println();

        System.out.println("Compare x and y: " + Integer.compare(x, y));
        System.out.println("Unsigned Compare x and y: "+Integer.compareUnsigned(x, y));

        System.out.println("x/y= "+x/y);
        System.out.println("x%y = "+x%y);
        System.out.println("(unsigned) x/y = "+Integer.divideUnsigned(x, y));
        System.out.println("(unsigned) x%y = "+Integer.remainderUnsigned(x, y));

        System.out.println("y/x= "+y/x);
        System.out.println("y%x = "+y%x);
        System.out.println("(unsigned) y/x = " + Integer.divideUnsigned(y, x));
        System.out.println("(unsigned) y%x = "+Integer.remainderUnsigned(y, x));


    }
/*
    public static boolean compare(int x, int y){
        int result = Integer.compare(x, y);
        if (result==0){
            System.out.println("Compare: x=y");
        }
        else if (result<0){
            System.out.println("Compare: x>y");
        }
        else {
            System.out.println("Compare: x<y");
        }
        return true;
    }
*/

}
