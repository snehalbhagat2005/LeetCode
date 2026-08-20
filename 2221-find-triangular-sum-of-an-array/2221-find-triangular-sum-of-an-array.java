class Solution {
    public int triangularSum(int[] nums) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        ArrayList<Integer> temp=new ArrayList<Integer>();

        for(int num :nums){
           list.add(num); 
        }

        while(list.size()>1){
            temp.clear();
            for(int i=0;i<list.size()-1;i++){
                temp.add((list.get(i)+list.get(i+1))%10);
            }
            list.clear();
            list.addAll(temp);
        }
        return list.get(0);
    }
}