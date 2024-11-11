class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        val answer = IntArray(m + n)
        var index = 0
        var i = 0
        var j = 0

        while (i < m && j < n) {
            if (nums1[i] < nums2[j])
                answer[index++] = nums1[i++]
            else
                answer[index++] = nums2[j++]   
        }

        while (i < m) {
            answer[index++] = nums1[i++]
        }

        while (j < n) {
            answer[index++] = nums2[j++]
        }

        for (i in 0..<(m + n)) {
            nums1[i] = answer[i]
        }
    }
}
