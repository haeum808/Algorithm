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
    fun averageOfLevels(root: TreeNode?): DoubleArray {
        val result = mutableListOf<Double>()
        val nodes = LinkedList<TreeNode>()
        nodes.offer(root)

        while (nodes.isNotEmpty()) {
            val currentLevel = mutableListOf<Double>()

            repeat(nodes.size) {
                val node = nodes.poll()
                currentLevel.add(node.`val`.toDouble())

                if (node.left != null) nodes.offer(node.left)
                if (node.right != null) nodes.offer(node.right)
            }
            result.add(currentLevel.average())
        }

        return result.toDoubleArray()
    }
}
