class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length;
        int count=0;
        int sum=0;
        int remove=n*5/100; 
        
        for(int i=remove;i<n-remove;i++){
            sum+=arr[i];   
            count++;
        }
           return (double)sum/count;
    }
}