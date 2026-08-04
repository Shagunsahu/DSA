import java.util.*;
class zeroesmatrix{

    public void setZeroes(int[][] matrix) {
        // Your code goes here
         int r=matrix.length;
            int c=matrix[0].length;
            boolean r1[]=new boolean[r];
            boolean c1[]=new boolean[c];
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    if(matrix[i][j]==0)
                   { r1[i]=true;
                   c1[j]=true;
                   }
                }
            }
             for(int i=0;i<r;i++){
                for(int j=0;j<c;j++)
                {
                    if(r1[i]||c1[j])
                    matrix[i][j]=0;
                }
            }
 for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
System.out.print(matrix[i][j]+"\t");
}
System.out.println();
}
    }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter the number of rows");
int r=sc.nextInt();
System.out.println("enter the number of columns");
int c=sc.nextInt();
int m=new int[x][y];
System.out.println("enter the matrix");
 for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
m[i][j]=sc.nextInt();
}
}
zeroesmatrix ob=new zeroesmatrix();
ob.setZeroes(m);


}
}