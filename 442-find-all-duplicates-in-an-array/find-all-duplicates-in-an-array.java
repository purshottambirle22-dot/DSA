class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer>result =new ArrayList<>();
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int e : nums){
            map.put(e,map.getOrDefault(e,0)+1);

           if(map.get(e)==2){
            result.add(e);
           }
        }
           return result;
    }
}