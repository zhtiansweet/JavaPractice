import java.util.Random;

/**
 * Created by tianzhang on 5/21/15.
 */
public class randomNumber {
    public static void main(String[] args) {

        int[] a = new int[7];
        for(int i=0;i<a.length;i++) {
            begin:
            while(true) {
                a[i] = random(1, 36);
                for (int j = 0; j < i; j++) {
                    if (a[j] == a[i]) continue begin;
                }
                break;
            }
            System.out.print(a[i]+" ");
        }

    }

    public static int random(int min, int max){
        Random r = new Random();
        return r.nextInt(max-min+1)+min;
    }
}
