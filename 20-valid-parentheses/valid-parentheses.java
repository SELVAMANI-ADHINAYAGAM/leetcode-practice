class Solution {
    public boolean isValid(String s) {
        Stack<Character> sta=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='['||ch=='{'||ch=='('){
                sta.push(ch);
            }
            else{
                if(sta.isEmpty()){
                    return false;
                }
                char top=sta.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {

                    return false;
                }
            }
        }
        return sta.isEmpty();
    }
}