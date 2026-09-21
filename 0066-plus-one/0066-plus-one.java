class Solution {
    public int[] plusOne(int[] digits) {

        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] %= 10;
            if (digits[i] != 0) {
                return digits;
            }
        }

        int[] ans = new int[n + 1];
        ans[0] = 1;
        return ans;

        // long number=0;

        // for(int i=0;i<digits.length;i++){
        //     number=(number*10)+digits[i];
        // }

        // number=number+1;

        // String s1=number.toString();

        // int[] ans=new int[s1.length()];

        // for(int i=0;i<s1.length();i++){
        //     ans[i]=s1.charAt(i);
        // }


        

        // long rev=0;
        // while(number>0){
        //     rev=rev*10 + number%10;
        //     number/=10;
        // }

        //int[] ans=new int[digits.length];

        // int i=0;
        // while(rev>0){
        //     arr=(int)rev%10;
        //     rev/=10;
        //     i++;
        // }

        // ArrayList<Integer> arr=new ArrayList<>();

        // while(rev>0){
        //     arr.add((int)rev%10);
        //     rev/=10;
        // }

        // int[] ans= new int[arr.size()];

        // for(int i=0;i<arr.size();i++){
        //     ans[i] =arr.get(i);
        // } 
        //return ans;
    }
}