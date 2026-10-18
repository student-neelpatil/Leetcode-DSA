package arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int [] solution_array=new int[2];

        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    solution_array[0]=i;
                    solution_array[1]=j;
                    return solution_array;
                }

            }
        }
        return solution_array;

    }
}
