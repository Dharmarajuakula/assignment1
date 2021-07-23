class Solution {
    public boolean isValid(String s) {
        Scanner sc=new Scanner(System.in);
        s=sc.next();
        
        Stack<Character> ct=new Stack<Character>();
        
        char[] ch=s.toCharArray();
        char t; 
        for(char i:ch)
        {
            t=ct.empty()?'&':ct.peek();
            if(t=='(' && i==')')
                ct.pop();
            else if(t=='{' && i=='}')
                ct.pop();
            else if(t=='[' && i==']')
                ct.pop();
            else
                ct.push(i);
        }
        return (ct.empty()?true:false);
    }
}
