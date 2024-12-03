import java.util.Arrays;

class Solution4 {
    public int maximumGap(int[] nums) {
        // 修改 1：n 应为 nums.length，而不是 nums.length - 1
        int n = nums.length;
        if (n < 2) {
            return 0;
        }

        long exp = 1;
        // 修改 2：buf 数组的大小应为 n，而不是 nums.length - 1
        int[] buf = new int[n];
        int maxVal = Arrays.stream(nums).max().getAsInt();

        // 修改 3：将 maxVal > exp 修改为 maxVal >= exp 以包含最大值
        while (maxVal >= exp) {
            int[] cnt = new int[10];

            for (int i = 0; i < n; i++) {
                int digit = (nums[i] / (int) exp) % 10;
                cnt[digit]++;
            }

            // 修改 4：确保 cnt 数组的循环结构正确，添加缺少的大括号
            for (int i = 1; i < 10; i++) {
                cnt[i] += cnt[i - 1];
            }

            // 修改 5：在复制元素到 buf 中时，正确使用 cnt 数组，调整括号结构
            for (int i = n - 1; i >= 0; i--) {
                int digit = (nums[i] / (int) exp) % 10;
                buf[cnt[digit] - 1] = nums[i];
                cnt[digit]--;
            }

            // 修改 6：将 exp 每次乘以 10，而不是加 10，以实现基数排序
            System.arraycopy(buf, 0, nums, 0, n);
            exp *= 10;
        }

        int ret = 0;
        // 修改 7：将 i 初始值改为 1，以正确计算相邻元素差值
        for (int i = 1; i < n; i++) {
            ret = Math.max(ret, nums[i] - nums[i - 1]);
        }

        return ret;
    }
}
