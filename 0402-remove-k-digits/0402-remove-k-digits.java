import java.util.*;

class Solution {
    public String removeKdigits(String s, int k) {
        Stack<Character> stack = new Stack<>();

        // Step 1: Build stack (monotonic increasing)
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            while (k > 0 && !stack.isEmpty() && stack.peek() > ch) {
                stack.pop();
                k--;
            }
            stack.push(ch);
        }

        // Step 2: Remove remaining k digits from end if needed
        while (k > 0 && !stack.isEmpty()) {
            stack.pop();
            k--;
        }

        // Step 3: Pop all to list (this reverses the order)
        ArrayList<Character> list = new ArrayList<>();
        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }

        // Step 4: Reverse the list back to normal order
        Collections.reverse(list);

        // Step 5: Remove leading zeros
        int idx = 0;
        while (idx < list.size() && list.get(idx) == '0') {
            idx++;
        }

        // Step 6: Build final string
        StringBuilder sb = new StringBuilder();
        for (int i = idx; i < list.size(); i++) {
            sb.append(list.get(i));
        }

        // Step 7: Handle edge case (empty string → "0")
        if (sb.length() == 0) {
            return "0";
        }

        return sb.toString();
    }
}