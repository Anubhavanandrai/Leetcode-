class Solution {
    public List<Integer> getRow(int rowIndex) {
        
//Create a main list where we will be adding all upcoming list
   List<List<Integer>> ls = new ArrayList<>();


//iterate for numsrow time
   for(int i=0;i<=rowIndex;i++)
   {
    //new list is created and added to main list
        ls.add(new ArrayList<>());


        for(int j=0;j<=i;j++)
        {
           if(j==i || j==0)
           {
               ls.get(i).add(1);
           }
           else{
            //adding of value at j-1 ,j together to get value of current j
               int x = ls.get(i-1).get(j-1) + ls.get(i-1).get(j);
               ls.get(i).add(x);
           }
        }


   }   
   //only we have to return list of asked row i.e rowindex
   return ls.get(rowIndex);
   }
}


