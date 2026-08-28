class matrixmedian {
    public int findMedian(int[][] matrix) {
      int n=matrix.length;
      int m=matrix.length;
      int r=(int)(Math.ceil(n/2));
       int c=(int)(Math.ceil(m/2));
       return matrix[r][c];
    }
    public static void main(String args[]){
        int[][] matrix=new int[10][10];
        System.out.println("Enter the elements of the matrix: ");
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                matrix[i][j]=Integer.parseInt(System.console().readLine());
            }
        }
        matrixmedian obj=new matrixmedian();
        int ans=obj.findMedian(matrix);
        System.out.println("The median of the matrix is: "+ans);
    }
}