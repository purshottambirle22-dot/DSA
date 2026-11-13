class Solution {
    public long sumAndMultiply(int n) {
        int x=0;
        int sum=0;
        while(n != 0){
          int digit=n%10;
          if(digit != 0){
             sum+=digit;
             x=x*10+digit; 
          }  
            n=n/10;
        }
        long num=reverse(x);
        return num*sum;
    }
    public long reverse(int n){
        int rev=0;
        while(n != 0){
           int lastDigit=n%10;
           rev=rev*10+lastDigit;
           n=n/10;  
        }
          return rev;
    }
}