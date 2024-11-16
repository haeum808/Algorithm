class Solution {
    fun isValid(s: String): Boolean {
        val stack = Stack<Char>()

        for (index in 0..<s.length) {
            val next = s[index]

            if (stack.isNotEmpty()) {
                val top = stack.peek()

                if (top == '(') {
                    if (next == ')') {
                        stack.pop()
                    } else {
                        stack.push(next)
                    }
                }
                else if (top == '[') {
                    if (next == ']') {
                        stack.pop()
                    } else {
                        stack.push(next)
                    }
                }
                else if (top == '{') {
                    if (next == '}') {
                        stack.pop()
                    } else {
                        stack.push(next)
                    }
                }
            } else {
                stack.push(next)
            }
        }
        return stack.size == 0
    }
}

/*
i will use stack

1. stack is empty 
1-1. stack.peek == netValue -> pop else push

if stack size == 0 return true
else size return false
 */