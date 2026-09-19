class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        for (int i : nums) {
            String temp = Integer.toString(i);
            for (int j = 0; j < temp.length(); j++) {
                arr.add(temp.charAt(j) - '0');
            }
        }
        
        int n=arr.size();
        int[] ans = new int[n];
        for (int k = 0; k < n; k++) {
            ans[k] = arr.get(k);
        }
        
        return ans;
    }
}
