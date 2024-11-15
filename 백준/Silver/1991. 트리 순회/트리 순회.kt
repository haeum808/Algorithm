import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

data class Node(
    var value: String,
    var left: Node? = null,
    var right: Node? = null,
)

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val root = Node("A")
    val map = mutableMapOf(Pair("A", root))
    val n = readLine().toInt()
    val preorder = StringBuilder()
    val inorder = StringBuilder()
    val postorder = StringBuilder()

    repeat(n) {
        val (parent, left, right) = readLine().split(" ")

        if (left != ".") {
            val leftChild = Node(left)
            map[parent]?.left = leftChild
            map[left] = leftChild
        }

        if (right != ".") {
            val rightChild = Node(right)
            map[parent]?.right = rightChild
            map[right] = rightChild
        }
    }

    fun preorderTraversal(node: Node?) {
        if (node == null) return

        preorder.append(node.value)
        preorderTraversal(node.left)
        preorderTraversal(node.right)
    }

    fun inorderTraversal(node: Node?) {
        if (node == null) return

        inorderTraversal(node.left)
        inorder.append(node.value)
        inorderTraversal(node.right)
    }

    fun postorderTraversal(node: Node?) {
        if (node == null) return

        postorderTraversal(node.left)
        postorderTraversal(node.right)
        postorder.append(node.value)
    }

    preorderTraversal(root)
    inorderTraversal(root)
    postorderTraversal(root)

    bw.write("${preorder}\n")
    bw.write("${inorder}\n")
    bw.write("$postorder")
    bw.flush()
    bw.close()
    close()
}
