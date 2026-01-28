class Solution {
    public List<Integer> majorityElement(int[] arr) {
        int n=arr.length;
        int majority=n/3;
       ArrayList<Integer>list=new ArrayList<>(); 
       HashMap<Integer,Integer>map=new HashMap<>();
       for(int e : arr){
         map.put(e,map.getOrDefault(e,0)+1); 
        
        if(map.get(e) > majority &&  !list.contains(e)){
             list.add(e); 
        }
       }
         return list;
    }
}