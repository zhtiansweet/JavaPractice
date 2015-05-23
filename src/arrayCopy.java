/**
 * Created by tianzhang on 5/21/15.
 */

import java.util.Arrays;

public class arrayCopy {
    public static void main(String[] args) {
        int[] src = new int[]{2, 3, 5, 1, 6};
        int[] dest1 = new int[10];


        System.arraycopy(src, 0, dest1, 3, 5);
        int[] dest2 = Arrays.copyOfRange(src, 2, 7);
        int[] dest3 = Arrays.copyOf(src, 3);

        System.out.println(Arrays.toString(dest1));
        System.out.println(Arrays.toString(dest2));
        System.out.println(Arrays.toString(dest3));

    }
}
