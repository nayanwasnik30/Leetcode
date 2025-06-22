class Solution {
    public double myPow(double x, int n) {
        if(n<0){
            return 1.0/helper(x,-1l*n);
        }
        return helper(x,n);
    }
    public double helper(double x,long n){
         if(n==0){
            return 1.0;
        }
        if(n%2 != 0){   
        double ans=x*helper(x,n-1);
        return ans;
        }
        
        double ans=helper(x,n/2);
        ans=ans*ans;
        return ans;
    }
}