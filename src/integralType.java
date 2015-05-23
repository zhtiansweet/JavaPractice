/**
 * Created by tianzhang on 5/13/15.
 */
public class integralType {
    public static void main(String[] args) {
/*
        int a1 = 5;
        int a2 = -5;
        int a3 = -0b101;
        int a4 = 0b1111_1111_1111_1111_1111_1111_1111_1011;
        int a5 = 0b1000_0000_0000_0000_0000_0000_0000_0101;

        byte d1 = 5;
        byte d2 = -5;
        byte d3 = -0b101;
        //byte d4 = 0b11111011;
        byte d5 = (byte)-0b1000_0000_0000_0000_0000_0000_0000_0101;
        byte d6 = -0b1000_0000;
        //byte d7 = 0b1000_0000;
        byte d8 = 0b0111_1111;
        byte d9 = (byte)0b1000_0000;
        //byte d5 = 0b10000000;
        //short b1 = 0b1000000000000000;
        //long c1 = 0b10110111l;
*/
        byte b = 39;
        short s = -130;
        int i = -10000;
        long l = 1234567890123456789l;
        int i1 = (int)5.533f;

        print("b =", b);
        print("s =", s);
        print("i =", i);
        print("l =", l);
        print("i1 =", i1);
        /*
        print("b&l =", b&l);
        print("i|l =", i|l);
        print("b^s =", b^s);
        print("b+i =", b+i);
        print("int b =", (int)b);
        print("byte l =", (byte)l);

/*
        print("a1 =", a1);
        print("a2 =", a2);
        print("a3 =", a3);
        print("a4 =", a4);
        print("a5 =", a5);

        print("d1 =", d1);
        print("d2 =", d2);
        print("d3 =", d3);
        print("d5 =", d5);
        print("d6 =", d6);
        print("d8 =", d8);
        print("d9 =", d9);
        //print("b1 =", b1);
        /*
        print("a1>>2 =", a1>>2);
        print("a1>>34 =", a1>>34);
        print("a2>>2 =", a2>>2);
        print("a2>>>2 =", a2>>>2);
        print("d1>>2 =", d1>>2);
        print("d2>>2 =", d2>>2);
        //print("a1&c1 =", a1&c1);
        */


    }


    static void print(String prefix, byte n){
        String s = String.format("%8s", Integer.toBinaryString(n & 0xFF)).replace(' ', '0');
        System.out.println(prefix + " " + s + " = " + n);
    }


    static void print(String prefix, short n){
        String s = String.format("%16s", Integer.toBinaryString(n & 0xFFFF)).replace(' ', '0');
        System.out.println(prefix + " " + s + " = " + n);
    }


    static void print(String prefix, int n){
        String s = Integer.toBinaryString(n);
        while(s.length() < 32) s="0"+s;
        System.out.println(prefix + " " + s + " = " + n);
    }


    static void print(String prefix, long n){
        String s = Long.toBinaryString(n);
        while(s.length() < 64) s="0"+s;
        System.out.println(prefix + " " + s + " = " + n);
    }
}

