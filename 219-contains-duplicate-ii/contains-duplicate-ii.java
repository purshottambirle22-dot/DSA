class Solution {
    public boolean containsNearbyDuplicate(int[] arr, int k) {
          HashSet<Integer> set=new HashSet<>();
          int left=0;
          for(int i=0; i<arr.length;i++){
             if(set.contains(arr[i])){
                return true;
             } 
             set.add(arr[i]);
             while(i-left >= k){
                set.remove(arr[left]); 
                left++;
             }
          }
             return false;
    }
}