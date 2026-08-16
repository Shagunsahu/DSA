import java.util.*;
class power {
    public double myPow(double x, int n) {
          double d=0.0;//your code goes here
          if(n>0)
          d=pow(x,n);
          else
           d=1.0/pow(x,-n);
          return d;
    }
    public double pow(double x,int n){
        if(n==0)
        return 1.0;
        else if(n==1)
        return x;
        else
        {
            if(n%2==0)
            return pow(x*x,n/2);
            else 
            return x*pow(x,(n-1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        power obj = new power();
        double x = sc.nextDouble();
        int n = sc.nextInt();
        double result = obj.myPow(x, n);
        System.out.println("Result: " + result);
    }
}