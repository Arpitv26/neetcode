class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] list = new int[nums.length];

        for (int i = 0; i < nums.length; i++){
            int tot = 1;
            for (int j = 0; j < nums.length; j++){
                if (i != j){
                    tot = tot * nums[j];
                }
            }

            list[i] = tot;
        }

        return list;

    }
}  
