class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
        for(int num1 : nums1){
            set.add(num1);
        }
        HashSet<Integer> result=new HashSet<>();
        for(int a : nums2){
            if(set.contains(a)){
             result.add(a);
            }
        }
          int ans[]=new int[result.size()];
          int i=0;
          for(int e : result){
             ans[i++]=e;
          } 
           return ans;
    }
}