import java.util.Arrays;

public class Sort012 {

    public static void main(String[] args) {
        int[] a = {0,2,1,0,2,2,1};
        sort012Array(a, a.length);
    }

    static void sort012Array(int a[], int n)
    {
        int one = 0;
        int zero = 0;
        int two = 0;
        for(int i = 0 ; i < n ; i++)
        {
            if( a[i] == 0 )
                zero++;
            else if( a[i] == 1 )
                one++;
            else if( a[i] == 2 )
                two++;
        }
        for(int i = 0 ; i < n ; i++){
            if(i < zero){
                a[i] = 0;
            }
            else if(one>0){
                a[i] = 1;
                one--;
            }
            else if(two>0)
            {
                a[i] = 2;
                two--;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
