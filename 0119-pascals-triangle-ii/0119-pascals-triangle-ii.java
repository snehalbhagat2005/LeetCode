class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> pas=new ArrayList<>();

       int n=rowIndex+1;

       for(int i=0;i<n;i++){
        pas.add(new ArrayList<Integer>());
        for(int j=0;j<=i;j++){
            if(j==0 || j==i){
                pas.get(i).add(1);
            }
            else{
                int val=pas.get(i-1).get(j)+pas.get(i-1).get(j-1);
                pas.get(i).add(val);
            }
        }
       }
       return pas.get(rowIndex);
    }
}