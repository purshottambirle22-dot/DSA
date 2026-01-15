class Solution {
    public int findPairs(int[] arr, int k) {
        if(k < 0){
          return 0;
        }
        Arrays.sort(arr);
        int uniquePair=0;
        int i=0;
        int j=i+1;
        while(i<arr.length &&  j<arr.length){
           if(i==j){
             j++;
             continue;
           }
           int diff=arr[j]-arr[i];
           if(diff == k){
              uniquePair++;
           
          int val=arr[i];

          while(i < arr.length && arr[i]==val){
              i++;
          }
          while(j < arr.length && arr[j]==val+k){
             j++;
            }
          }else if(diff < k){
               j++;
          }else{
              i++;
          }
        }
         return uniquePair;
     }
}