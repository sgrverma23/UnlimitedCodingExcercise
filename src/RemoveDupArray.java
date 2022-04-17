public class RemoveDupArray {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,3,4,5,5,6,6,6,6,8};
        System.out.println(removeDup(arr));
    }

    public static int removeDup(int[] arr){
        int i = 0;
        for(int j = 1;j<arr.length;j++){
            if(arr[j]!=arr[i]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i;
    }
}
