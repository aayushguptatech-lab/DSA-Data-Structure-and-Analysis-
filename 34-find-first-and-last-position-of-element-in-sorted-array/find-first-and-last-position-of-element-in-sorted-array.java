class Solution {
    static int binary(int[] nums, int n, int target, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }
            else if (nums[mid] > target) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }

        return -1;
    }

    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;

        int got = binary(nums, n, target, 0, n - 1);

        if (got == -1) {
            return new int[]{-1, -1};
        }
        else {
            int start1 = 0;
            int end1 = got - 1;
            int leftans = got;

            while (start1 <= end1) {
                int temp = binary(nums, n, target, start1, end1);

                if (temp == -1) {
                    break;
                }

                leftans = temp;
                end1 = temp - 1;
            }

            int start2 = got + 1;
            int end2 = n - 1;
            int rightans = got;

            while (start2 <= end2) {
                int temp = binary(nums, n, target, start2, end2);

                if (temp == -1) {
                    break;
                }

                rightans = temp;
                start2 = temp + 1;
            }

            return new int[]{leftans, rightans};
        }
    }
}