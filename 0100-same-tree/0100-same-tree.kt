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
    var plist = mutableListOf<Pair<Int, Int>>()
    var qlist = mutableListOf<Pair<Int, Int>>()

    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
        inorder(p, plist, 0)
        inorder(q, qlist, 0)

        if (plist.size != qlist.size) return false

        for (i in 0..<plist.size) {
            if (plist[i].first != qlist[i].first ||
            plist[i].second != qlist[i].second
            ) return false
        }

        return true
    }
    
    fun inorder(root: TreeNode?, result: MutableList<Pair<Int, Int>>, count: Int) {
        if (root == null) return

        inorder(root.left, result, count + 1)
        result.add(root.`val` to count)
        inorder(root.right, result, count + 1)
    }
}