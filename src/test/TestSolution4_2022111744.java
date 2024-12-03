import org.junit.Test;
import static org.junit.Assert.*;

public class TestSolution4_2022111744 {

    private final Solution4 solution = new Solution4();

    /**
     * 测试方法 1：基本测试
     * 测试目的：验证算法能否在一般无序数组中正确计算相邻元素的最大差值。
     * 测试用例：nums = {3, 6, 9, 1}
     * 预期结果：3
     */
    @Test
    public void testBasicCase() {
        int[] nums = {3, 6, 9, 1};
        int expected = 3;
        assertEquals("测试失败：基本测试用例", expected, solution.maximumGap(nums));
    }

    /**
     * 测试方法 2：单一元素
     * 测试目的：当数组中只有一个元素时，验证函数是否返回 0。
     * 测试用例：nums = {10}
     * 预期结果：0
     */
    @Test
    public void testSingleElement() {
        int[] nums = {10};
        int expected = 0;
        assertEquals("测试失败：单一元素", expected, solution.maximumGap(nums));
    }

    /**
     * 测试方法 3：所有元素相等
     * 测试目的：当所有数组元素相等时，验证函数是否返回 0。
     * 测试用例：nums = {5, 5, 5, 5}
     * 预期结果：0
     */
    @Test
    public void testAllElementsEqual() {
        int[] nums = {5, 5, 5, 5};
        int expected = 0;
        assertEquals("测试失败：所有元素相等", expected, solution.maximumGap(nums));
    }

    /**
     * 测试方法 4：无序数组
     * 测试目的：在无序数组中验证算法是否正确计算相邻元素之间的最大差值。
     * 测试用例：nums = {10, 3, 5, 7, 15}
     * 预期结果：5
     */
    @Test
    public void testUnorderedElements() {
        int[] nums = {10, 3, 5, 7, 15};
        int expected = 5;
        assertEquals("测试失败：无序元素", expected, solution.maximumGap(nums));
    }

    /**
     * 测试方法 5：包含最小和最大值
     * 测试目的：在数组中包含极大值和极小值，验证算法的边界处理能力。
     * 测试用例：nums = {0, 1000000000}
     * 预期结果：1000000000
     */
    @Test
    public void testMinMaxValues() {
        int[] nums = {0, 1000000000};
        int expected = 1000000000;
        assertEquals("测试失败：最小值和最大值", expected, solution.maximumGap(nums));
    }

    /**
     * 测试方法 6：空数组
     * 测试目的：验证空数组输入情况下，函数是否能正确返回 0（不符合题目要求的情况）。
     * 测试用例：nums = {}
     * 预期结果：0
     */
    @Test
    public void testEmptyArray() {
        int[] nums = {};
        int expected = 0;
        assertEquals("测试失败：空数组", expected, solution.maximumGap(nums));
    }

    /**
     * 测试方法 7：最小有效长度数组
     * 测试目的：测试包含两个元素的数组，验证算法在最小有效长度时的表现。
     * 测试用例：nums = {1, 9}
     * 预期结果：8
     */
    @Test
    public void testMinimumValidLength() {
        int[] nums = {1, 9};
        int expected = 8;
        assertEquals("测试失败：最小有效数组长度", expected, solution.maximumGap(nums));
    }
}