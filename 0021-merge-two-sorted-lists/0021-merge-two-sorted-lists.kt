/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        if (list1 == null) return list2
        else if (list2 == null) return list1
        else if (list1 == null && list2 == null) return list1

        var curList1 = list1
        var curList2 = list2
        var newListNode: ListNode? = null

        if (curList1.`val` < curList2.`val`) {
            newListNode = ListNode(curList1.`val`)
            curList1 = curList1.next
        } else {
            newListNode = ListNode(curList2.`val`)
            curList2 = curList2.next
        }

        val root = newListNode

        while(curList1 != null && curList2 != null) {
            if (curList1.`val` < curList2.`val`) {
                newListNode?.next = ListNode(curList1.`val`)
                newListNode = newListNode?.next
                curList1 = curList1?.next
            } else {
                newListNode?.next = ListNode(curList2.`val`)
                newListNode = newListNode?.next
                curList2 = curList2?.next
            }   
        }

        while(curList1 != null) {
            newListNode?.next = ListNode(curList1.`val`)
            newListNode = newListNode?.next
            curList1 = curList1?.next
        }

        while(curList2 != null) {
            newListNode?.next = ListNode(curList2.`val`)
            newListNode = newListNode?.next
            curList2 = curList2?.next
        }

        return root
    }
}