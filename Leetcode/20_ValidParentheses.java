class Solution {
    private boolean match(char a, char b) {
        return (
            (a == '(' && b == ')') || 
            (a == '{' && b == '}') || 
            (a == '[' && b == ']')
        );
    }
    
    public boolean isValid(String s) {
        Stack<Character> data = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (data.size() != 0 && match(data.peek(), c)) {
                data.pop();
            }
            else {
                data.push(c);
            }
        }
        return (data.size() == 0);
    }
}
