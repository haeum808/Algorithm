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
    fun isSymmetric(root: TreeNode?): Boolean {
        if (root == null) return true

        return findSymmetric(root.left, root.right)
    }

    fun findSymmetric(root: TreeNode?, flip: TreeNode?): Boolean {
        if (root == null && flip == null) return true
        if (root == null || flip == null) return false
        if (root.`val` != flip.`val`) return false

        return findSymmetric(root.left, flip.right) && findSymmetric(root.right, flip.left)
    }
}