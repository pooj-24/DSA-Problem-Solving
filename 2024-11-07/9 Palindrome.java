class Solution {
    public boolean isPalindrome(int x) {
     if(x < 0)  {
        return false;
     } 
     int n = x;
     long Reversed = 0;
     
     while(n > 0){
        Reversed = Reversed*10 + n%10;
        n /=10;

     }
      return Reversed == x;
    }
}
