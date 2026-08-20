class Solution {
    public List<Integer> spiralOrder(int[][] arr) {

        List<Integer> ans=new ArrayList<>();
        int rows=arr.length;
        int cols=arr[0].length;

        int fr=0;
        int fc=0;
        int lc=cols-1;
        int lr=rows-1;

        while(fr<=lr && fc<=lc){
            for(int i=fc;i<=lc;i++){
                ans.add(arr[fr][i]);
            }
            fr++;

            for(int j=fr;j<=lr;j++){
                ans.add(arr[j][lc]);
            }
            lc--;

            if (fr <= lr) {
            for(int k=lc;k>=fc;k--){
                ans.add(arr[lr][k]);
            }
            lr--;
            }

            if(fc<=lc){
            for(int l=lr;l>=fr;l--){
                ans.add(arr[l][fc]);
            }
            fc++;
            }
        }

        return ans;
    }
}