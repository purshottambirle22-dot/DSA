class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int nextGreater[]=new int[n];
        Stack<Integer>s=new Stack<>();
         for(int i=2*n-1;i>=0;i--){
            int index=i%n;
            while(!s.isEmpty() && s.peek() <= nums[index]){
                  s.pop();
            }
            if(i < n){
            if(s.isEmpty()){
               nextGreater[index]=-1; 
            }else{
                nextGreater[index]=s.peek();
               }
            }    
              s.push(nums[index]);
            
         }
            return nextGreater;
        }
    }
