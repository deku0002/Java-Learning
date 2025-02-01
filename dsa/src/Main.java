import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] ar = {4,1,-2,6,8,3,0};
        System.out.println(maxSubArray(ar));
    }

    public static int maxSubArray(int[] nums){
        int maxNumSoFar = nums[0];
        int currentSum = nums[0];

        for(int i=1;i<nums.length;i++){

            if (currentSum<0){
                currentSum=0;
            }
            currentSum = currentSum + nums[i];
            if (currentSum>maxNumSoFar){
                maxNumSoFar = currentSum;
            }
        }
        return maxNumSoFar;
    }
}