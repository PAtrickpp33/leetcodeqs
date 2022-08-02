class Solution {
    public void rotate(int[] nums, int k) {
        int N = nums.length;
        // 【错误点】 每旋转N次，相当于 没旋转。 这一步非常的重要！！ 因为 k 有可能回答与N，这相当于 会 轮转 几个空圈，所以最后要算出来 到底在长度为N的数字上，单次旋转的次数
        k = k % N;   // 【错误点很重要】每旋转N次，相当于 没旋转。
        int pos = N - k;
        reverse(nums, 0, pos - 1);
        reverse(nums, pos, N - 1);
        reverse(nums, 0, N - 1);
    }

    // 这里涉及到 函数抽象化。 因为 三个部分做的都是同样的事情，所以可以抽象成 一个函数来做。
    public void reverse(int[] arr, int L, int R) {
        while (L <= R) {
            swap(arr, L++, R--);
        }
    }

    public void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}