class Solution {
    public boolean isValid(String s) {
        
        int len = s.length();
        Stack<Character> stack = new Stack<>();
        int count=0;
        
        if(len==1 || s== null){
            return false;
        }
        
        for(int i=0; i< len ; i++){
            
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                stack.push(s.charAt(i));
                count++;
            }
            
            if(s.charAt(i)==')'||s.charAt(i)=='}'||s.charAt(i)==']'){
                char sch= s.charAt(i);
                if(stack.empty()){
                    return false;
                }
                char ch = stack.peek();
                if(sch==')' && ch!='('){
                    return false;
                }
                else if(sch=='}' && ch!='{'){
                    return false;
                }
                else if(sch==']' && ch!='['){
                    return false;
                }
                else{
                    stack.pop();
                    count--;
                }
                
            }
            
            
        }
        if(count!=0) return false;
        
        return true;
    }
}