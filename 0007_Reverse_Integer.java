class Solution {
    public int reverse(int x) {
        Stack<Integer> stack = new Stack<Integer>();
        int rem = 0;
        int quotient = x;
        int factor = (x<0)?(-1):1;
        int index = 0;
        long revx=0;
        
        // System.out.println("Input number is : "+x);
        // System.out.println("Factor is : "+factor);
        
        while(quotient!=0){
            stack.push(Math.abs(quotient%10));
            quotient = quotient/10;
        }
        
        // while(!stack.empty()){
        //     System.out.println(stack.pop());
        // }
                
        while(!stack.empty()){
            revx = revx + (int)(Math.pow(10, index)*stack.pop());
            index++;
        }
        
        if(factor == -1){
            revx = revx > Math.pow(2,31)?0:revx*factor;
        }else{
            revx = revx > Math.pow(2,31)-1?0:revx;
        }    
        return((int)revx);
    }
}
