import java.util.Arrays;

/**
 * Created by tianzhang on 5/14/15.
 */
public class PrimeNumber {
    public static void main (String arg[]){
        //Initialize an array
        int[] a=new int[99];
        for(int i=0;i<=98;i++){
            a[i] = i+2;
        }

        //Sieve of Eratosthenes
        for(int i=0;i<=98;i++){
            if(a[i]==0)  continue;     //a[i] has been deleted
            else{
                System.out.print(a[i]+" ");
                for(int j=i+1;j<=98;j++){
                    if(a[j]%a[i]==0)  a[j]=0;     //Delete a[j]
                }
            }
        }
        System.out.println();

        //Better solution

        //Initialize an array
        boolean[] b = new boolean[101];
        for(int i=2;i<101;i++){
            b[i] = true;
        }

        for(int i=0;i<=10;i++){     //There is no need to traverse i>sqrt(n)
            if (b[i]) {
                //Delete i's multiples
                for (int j = i*i; j < 101; j += i) {      //Multiples less than i*i have been checked before
                    b[j] = false;
                }
            }
        }

        //Output
        for (int i=0;i<101;i++){
            if (b[i])   System.out.print(i+" ");
        }


    }
}
