package com.practice.leetCode;

import java.util.Stack;

/*
20. Valid Parentheses
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.


Example 1:
Input: s = "()"
Output: true

Example 2:
Input: s = "()[]{}"
Output: true

Example 3:
Input: s = "(]"
Output: false

Example 4:
Input: s = "([])"
Output: true

Example 5:
Input: s = "([)]"
Output: false

Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'.
 */
public class ValidParentheses {

    static boolean isValid(String s) {

        char[] charArray = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (char c : charArray) {
            if (stack.isEmpty()){
                stack.push(c);
            }else if ((stack.peek() == '(' && c == ')')
                    || (stack.peek() == '[' && c == ']'
                    || (stack.peek() == '{' && c == '}'))) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        boolean valid = isValid("([)]");

        System.out.println("Valid Parentheses: " + valid);
    }
}
