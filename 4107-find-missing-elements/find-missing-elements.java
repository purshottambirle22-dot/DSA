class Solution {
    public List<Integer> findMissingElements(int[] arr) {
        ArrayList<Integer>result=new ArrayList<>();
        HashSet<Integer>set=new HashSet<>();
        for(int e : arr){
           set.add(e); 
        }
        int minimum=Integer.MAX_VALUE;
        int maximum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
         maximum=Math.max(arr[i],maximum);
         minimum=Math.min(arr[i],minimum);
        }
        for(int k=minimum;k<=maximum;k++){
            if(!set.contains(k)){
              result.add(k);  
            }
        } 
           return result;
    }       
} 
