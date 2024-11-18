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
    fun getMinimumDifference(root: TreeNode?): Int {
        var prev : TreeNode? = null
        var result = 100_001

        fun dfs(root: TreeNode?) {
            if (root == null) return

            dfs(root.left)
            if (prev != null) {
                result = minOf(result, abs(prev!!.`val` - root.`val`))
            }
            prev = root
            dfs(root.right)
        }
        dfs(root)

        return result
    }
}