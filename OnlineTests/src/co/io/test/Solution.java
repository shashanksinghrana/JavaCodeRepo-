package co.io.test;
class Solution {
    public boolean solution(int mat[][]) {
        // write your code in Java SE 8
    	int n = mat.length;
        for(int i =0 ; i< n-1; i++)
        {
            int min_row=mat[i][1],col_ind=0;
            for(int j =1; j<n;j++){
                if(min_row > mat[i][j]){
                    min_row=mat[i][j];
                    col_ind=j;
                }
            }
            int k;
            for(k=1;k<n-1;k++){
                if(min_row < mat[k][col_ind]){
                    break;
                }
            }
            if(k==n-1){
                System.out.println("Value of saddle point"+ min_row);
                return true;
            }
        }
        return false;
    }



public static void main(String args[]){
	Solution s = new Solution();
    int mat[][]={{0,1,9,3},
                  {7,5,8,3},
                  {9,2,9,4},
                  {4,6,7,1}};
                  if(s.solution(mat)== false){
                   System.out.println("No saddle point");   
                  }
}
}