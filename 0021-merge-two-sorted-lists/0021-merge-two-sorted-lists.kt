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
        var listOne = list1
        var listTwo = list2
        var dummy = ListNode(0)
        val result = dummy

        while (listOne != null && listTwo != null) {
            if (listOne.`val` < listTwo.`val`) {
                dummy.next = listOne
                listOne = listOne.next
            } else {
                dummy.next = listTwo
                listTwo = listTwo.next
            }
            dummy = dummy.next
        }

        if (listOne != null) {
            dummy.next = listOne
        }

        if (listTwo != null) {
            dummy.next = listTwo
        }

        return result.next
    }
}
