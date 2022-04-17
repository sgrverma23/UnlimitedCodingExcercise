public class climbingStairs {

    public static int climbStairs(int n) {
        // 2-3-5-8-13
        //1-1-2-3-5-8-13-21
        int count = 1;

        int nums[] = new int[n+1];
        nums[0] = 1;
        nums[1] = 1;

        for(int i=2; i<=n; i++){
            nums[i] = nums[i-1] + nums[i-2];
        }

        return nums[n];
    }

    public static void main(String[] args) {
        int x = climbStairs(7);
        System.out.println(x);

    }
}
