class Solution {
    public boolean isEven(int n){
        if(n%2==0){
          return true;  
        }else{
          return false;
        } 
    }
    
    public int firstUniqueEven(int[] arr) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i])==1 && isEven(arr[i])){
                return arr[i];
            }
        }
            return -1;
    }
}