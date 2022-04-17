import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures {

    public static void main(String[] args) {
        int[] temperatures = {73,74,75,71,69,72,76,73};
        System.out.println(Arrays.toString(dailyTemperatures(temperatures)));
    }
    public static int[] dailyTemperatures(int[] temperatures) {

        int[] ans= new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<temperatures.length;i++)
        {
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()])
            {
                int index= stack.pop();
                ans[index]= i-index;
            }
            stack.push(i);
        }

        return ans;

    }
}
