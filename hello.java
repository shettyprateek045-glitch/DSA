class Solution {
    public int majorityElement(int[] nums) {
    int x=nums[0];
    int count=0;
    for(int i=0;i<nums.length-1;i++) {
        for(int j=1;j<nums.length;j++) {
            if(nums[i]==nums[j]) {
                count++;
            }
        }
        if(count>nums.length/2) {
            x=nums[i];
            return x;
        }
        count=0;
    }
   return x;
    }
    public static void main(String args[]) {
        int[] nums={3,2,3};
        Solution s=new Solution();
        System.out.println(s.majorityElement(nums));
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++) {
            for(int j=i+1;j<nums.length;j++) {
                if(nums[i]+nums[j]==target) {
                    return new int[] {i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String args[]) {
        int[] nums={1,6,2,10,3};
        int target=7;
        Solution s=new Solution();
        int[] result=s.twoSum(nums,target);
        System.out.println(result[0]+" "+result[1]);
    }
}
        