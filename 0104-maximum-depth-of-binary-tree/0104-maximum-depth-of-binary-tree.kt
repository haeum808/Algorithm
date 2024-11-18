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
    var max = 0    

    fun maxDepth(root: TreeNode?): Int {

        fun dfs(root: TreeNode?, depth: Int) {
            if (root == null) {
                max = maxOf(max, depth)
                return
            }

            dfs(root?.left, depth + 1)
            dfs(root?.right, depth + 1)
        }

        dfs(root, 0)

        return max
    }
}