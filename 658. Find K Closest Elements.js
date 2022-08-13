/**
 * @param {number[]} arr
 * @param {number} k
 * @param {number} x
 * @return {number[]}
 */
 var findClosestElements = function (arr, k, x) {
    let left = 0;
    //缩小右侧区间
    let right = arr.length - k;
    while (left < right) {
        let mid = (left + right) >>> 1;
        //用折线来理解，求解最底部的k个元素
        if (x - arr[mid] > arr[mid + k] - x) {
            left = mid + 1;
        } else {
            right = mid;
        }
    }
    //js中 slice 函数，获取区间为[left, left+k)
    return arr.slice(left, left + k);
};