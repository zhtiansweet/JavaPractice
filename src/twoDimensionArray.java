/**
 * Created by tianzhang on 5/21/15.
 */

import java.util.Arrays;

public class twoDimensionArray {
    public static void main(String[] args) {
        int[][] t1 = new int[4][];
        t1[0] = new int[]{1,2,3,4,5};
        t1[1] = new int[3];

        int[][] t2 = new int[4][5];
        t2[0] = new int[]{1,2,3,4,5};
        t2[1] = new int[]{1,2,3};
        for(int i=0;i<t2[2].length;i++) t2[2][i] = i;

        System.out.println(Arrays.deepToString(t1));
        System.out.println(Arrays.deepToString(t2));
    }

}
