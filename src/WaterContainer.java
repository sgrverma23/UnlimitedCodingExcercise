public class WaterContainer {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length -1;
        int maxWater = 0;
        while(start < end){
            int curWater = min(height[start], height[end])*(end-start);
            if(curWater > maxWater){
                maxWater = curWater;
            }
            if(height[start]<height[end]){
                start++;
            }else{
                end--;
            }
        }
        return maxWater;
    }
    private int min(int a, int b){
        return Math.min(a, b);
    }

    public static void main(String[] args) {
        int[] h = new int[]{1, 4, 6, 2, 7, 3, 8, 5,3};
        WaterContainer w = new WaterContainer();
        int x = w.maxArea(h);
        System.out.println(x);
    }
}
