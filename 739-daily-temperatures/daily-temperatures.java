class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int ans[]=new int [n];
        Stack<Integer> s =new Stack<>();
        ans[n-1]=0;
        s.push(n-1);
        for(int i=n-2; i>=0; i--){
            int currTemp=temperatures[i];

            while(!s.isEmpty() && currTemp >= temperatures[s.peek()]){
                 s.pop();
            }
             if(s.isEmpty()){
                ans[i]=0; 
             }else{
                int prevHigh = s.peek();
                ans[i]=prevHigh-i;
             }
            s.push(i);
        }
             return ans;
    }
}