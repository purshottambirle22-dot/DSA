class Solution {
    public String reverseWords(String s) {
               String t="";
          String arr[]=s.split("\\s+");
          for(int i=arr.length-1; i>=0; i--){
              t=t+arr[i]+" ";
          }  
             return t.trim();

    }  
}    