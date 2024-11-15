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
    val result = mutableListOf<Int>()

    fun inorderTraversal(root: TreeNode?): List<Int> {
        if (root == null) return listOf()

        inorder(root)

        return result
    }

    fun inorder(root: TreeNode?) {
        if (root == null) return

        inorder(root.left)
        result.add(root.`val`)
        inorder(root.right)
    }
}