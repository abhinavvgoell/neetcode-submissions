class NumMatrix {
    int n;
    int m;
    int[][] mat;
    int[][] mate;
        public NumMatrix(int[][] matrix) {
        this.mat= matrix;
        this.n=matrix.length;
        this.m=matrix[0].length;
         mate = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mate[i][j]=mat[i][j];
            }
        }
       
         for(int i=0;i<n;i++){
        int j=1;
        while(j<m){
            mate[i][j]=mat[i][j]+mate[i][j-1];
            j++;
        }
    }
    for(int j=0;j<m;j++){
        int i=1;
        while(i<n){
            mate[i][j]=mate[i][j]+mate[i-1][j];
            i++;
        }
    }
    }
    
   

    
    public int sumRegion(int row1, int col1, int row2, int col2) {
int sum=0;
if(row1==0 && col1==0){
     sum = mate[row2][col2];
}
else if (row1==0){
     sum = mate[row2][col2] - mate[row2][col1 - 1];
}
else if(col1==0){
    sum = mate[row2][col2]- mate[row1 -1][col2];
}
        else{
     sum = mate[row2][col2]+mate[row1 - 1][col1 -1] - mate[row2][col1 - 1] - mate[row1 -1][col2];
        }
        return sum;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */