public class TrapWater {
    public static void main(String[] args) {
        int[] arr = new int[] {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        trapWater(arr);
    }
    public static void trapWater(int[] arr){
        int[] left = new int[arr.length];
        int[] right = new int[arr.length];
        int water = 0;
        left[0] = arr[0];
        right[arr.length-1] = arr[arr.length-1];
        for(int i=1;i<arr.length;i++)
            left[i] = Math.max(left[i-1], arr[i]);
        for(int j=arr.length-2;j>=0;j--)
            right[j] = Math.max(right[j+1],arr[j]);
        for(int i=0;i<arr.length;i++)
            water += Math.min(left[i], right[i]) - arr[i];
        System.out.println(water);
    }
}
