class Solution {
    public int minimumDifference(int[] arr, int k) {
         if(k==1){
           return 0;
         }
        Arrays.sort(arr);
        int minDiff=Integer.MAX_VALUE;
        for(int i=0; i+k-1<arr.length;i++){
            int diff=arr[i+k-1]-arr[i];
            minDiff=Math.min(minDiff,diff);
               }
               return minDiff;
            }
        }
           
    
