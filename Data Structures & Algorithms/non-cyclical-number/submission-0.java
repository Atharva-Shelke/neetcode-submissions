class Solution {
    public boolean isHappy(int n) {
        int slow=n,fast=n;
        while(fast!=1){
            slow=sumOfSqrs(slow);
            fast=sumOfSqrs(fast);
            fast=sumOfSqrs(fast);
            if(slow==fast && slow!=1){
                return false;
            }
        }
        return true;
    }

    static int sumOfSqrs(int x){
        int sum=0;
        while(x!=0){
            int d = x%10;
            x/=10;
            sum = sum + (d*d);
        }
        return sum;
    }
}
