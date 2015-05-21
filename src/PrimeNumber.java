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
    }
}
