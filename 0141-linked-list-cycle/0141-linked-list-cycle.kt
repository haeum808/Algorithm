/**
 * Example:t 
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun hasCycle(head: ListNode?): Boolean {
        var turtle = head
        var rabbit = head

        while (rabbit != null && rabbit.next != null) {
            turtle = turtle?.next
            rabbit = rabbit?.next?.next
            if (turtle == rabbit) return true
        }

        return false
    }
}
