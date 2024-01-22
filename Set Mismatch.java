class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        int len = nums.length;
        Arrays.sort(nums);
        int num = 0;
        for (int i = 0; i < len - 1; i++) {
            num ^= (i + 1);
            if (nums[i] == nums[i + 1]) {
                result[0] = nums[i];
            } else {
                num ^= nums[i];
            }
        }
        result[1] = num ^ len ^ nums[len - 1];
        return result;
    }
}
