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
    val set = hashSetOf<ListNode?>()

    fun hasCycle(head: ListNode?): Boolean {
        var currentHead = head

        while (currentHead?.next != null) {
            if (set.contains(currentHead)) return true
            set.add(currentHead)

            currentHead = currentHead.next
        }

        return false
    }
}