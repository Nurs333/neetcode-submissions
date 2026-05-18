class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;

        
        while (r != l) {
            int sum = numbers[l] + numbers[r];
            if (sum == target) {
                int newr = r + 1;
                int newl = l + 1;
                return new int[]{newl,newr};
            }
            if (sum < target) {
                l++;
            } 
            if (sum > target) {
                r--;
            }
        }

        return new int[]{-1, -1};


    }
}