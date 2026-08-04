class Solution {
    public int pascalTriangleI(int r, int c) {
int n=r-1;
int m=c-1;
int result=fact(n) / (fact(m) * fact(n - m));

 return result;
    }
    public int fact(int n){
        if(n==0||n==1)
        return 1;
        else 
        return n*fact(n-1);
    }
}