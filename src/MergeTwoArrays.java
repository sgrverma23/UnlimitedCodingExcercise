import java.util.Arrays;
import java.util.List;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6};
        int[] arr2 = {2,4,6,8};
        int[] result = new int[arr.length+arr2.length];
        mergeArrays(arr, arr2, result, arr.length, arr2.length, result.length);
    }

    private static void mergeArrays(int[] arr, int[] arr2, int[] result, int length, int length1, int resultlen) {
        int i=0,j=0,k=0;
        while(i< length && j<length1){
            if(arr[i]<arr2[j])
                result[k++]= arr[i++];
            else
                result[k++] = arr2[j++];
        }
        while(i< length){
            result[k++] = arr[i++];
        }
        while(j<length1){
            result[k++] = arr2[j++];
        }

        System.out.println(Arrays.toString(result));
    }
}
