class matrixmedian {
    public int findMedian(int[][] matrix) {
      int n=matrix.length;
      int m=matrix.length;
      int r=(int)(Math.ceil(n/2));
       int c=(int)(Math.ceil(m/2));
       return matrix[r][c];
    }
    public static void main(String args[]){
        int[][] matrix={{1,3,5},{2,6,9},{3,6,9}};
        matrixmedian obj=new matrixmedian();
        int ans=obj.findMedian(matrix);
        System.out.println("The median of the matrix is: "+ans);
    }
}