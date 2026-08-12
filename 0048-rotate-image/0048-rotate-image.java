class Solution {
    public void rotate(int[][] matrix) {
        
     int row=matrix.length -1;
   
     int coloumn=matrix[0].length-1;
//first find transpose of matrix 
     for(int i=0;i<=row;i++)
     {
       for(int j=0;j<i;j++)
       {
        int temp=matrix[i][j];
        matrix[i][j]=matrix[j][i];
        matrix[j][i]=temp;
       }
     }
    
  //Then reverse the array
     for(int i=0;i<=row;i++)
     {
    int x=0;
    int y=coloumn;
       while(x<=y)
       {
         int temp=matrix[i][x];
        matrix[i][x]=matrix[i][y];
        matrix[i][y]=temp;
        x++;
        y--;
       }
     }
       
    }
}