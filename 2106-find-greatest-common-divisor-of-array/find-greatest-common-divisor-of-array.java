class Solution {
    public int findGCD(int[] nums) {
        int maxNum=maxInNums(nums);
        int minNum=minInArray(nums);
        int ans=1;
        for(int i=1;i<=minNum;i++){
            if(maxNum % i==0 && minNum % i==0){
                ans=i;
            } 
        }
           return ans;
    }
    public int maxInNums(int nums[]){
       int largest=Integer.MIN_VALUE;
       for(int i=0;i<nums.length;i++){
           if(nums[i] > largest){
             largest=nums[i];
           }
       } 
            return largest;
    }
    public int minInArray(int nums[]){
       int smallest=Integer.MAX_VALUE;
       for(int i=0;i<nums.length;i++){
          if(nums[i] < smallest){
            smallest=nums[i];
          }
       } 
           return smallest;
    }


}