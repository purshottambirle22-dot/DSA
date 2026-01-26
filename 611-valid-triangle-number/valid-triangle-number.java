class Solution {
    public int triangleNumber(int[] arr) {
        int n=arr.length;
        if(n < 3){
          return 0; 
        }
        int count=0;
        Arrays.sort(arr);
        for(int i=arr.length-1;i>=2;i--){
             int left=0;
             int right=i-1;
             while(left < right){
                if(arr[left]+arr[right] > arr[i]){
                    count+=(right-left);   
                   right--;
                }else{
                    left++;
                } 
             }
        }   
                return count;
    }
}