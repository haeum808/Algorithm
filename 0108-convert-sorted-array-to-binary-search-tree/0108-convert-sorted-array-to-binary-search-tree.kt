/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun sortedArrayToBST(nums: IntArray): TreeNode? {
        return makeBST(nums, 0, nums.size - 1)
    }

    fun makeBST(nums: IntArray, left: Int, right: Int): TreeNode? {
        if (left > right) return null
        val mid = (left + right) / 2
        val rootNode = TreeNode(nums[mid])
        rootNode.left = makeBST(nums, left, mid - 1)
        rootNode.right = makeBST(nums, mid + 1, right)
        return rootNode
    }
}