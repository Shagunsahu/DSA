import java.util.*;
class nthroot{
    public int NthRoot(int N, int M) {
        int l=0,h=M,m;
        while(l<=h){
            m=(l+h)/2;
            int pow=1;
            for(int i=1;i<=N;i++)
            { pow=pow*m;
            if(pow>M)
            break;
            }
            if(pow<M)
            l=m+1;
            else if(pow>M)
            h=m-1;
            else
            return m;
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int N=sc.nextInt();
        System.out.println("Enter the value of M:");
        int M=sc.nextInt();
        nthroot obj=new nthroot();
        int ans=obj.NthRoot(N,M);
        if(ans==-1)
        System.out.println("No integer root exists.");
        else
        System.out.println("The "+N+"th root of "+M+" is: "+ans);
    }
}
