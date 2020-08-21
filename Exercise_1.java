class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        return top==-1;//Write your code here 
    } 

    Stack() 
    { 
        top=-1;//Initialize your constructor 
    } 
  
    boolean push(int x) 
    { 
        if(top!=max-1)
        {
            top=top+1;
            arr[top]=x;
        }
        else 
            return top==-1;
            
         //Check for stack Overflow
        //Write your code here
    } 
  
    int pop() 
    { 
        if(isEmpty())
            return -1;
        else
            return arr[top--];
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
    } 
  
    int peek() 
    { 
        return arr[top];
        //Write your code here
    } 
} 
  
// Driver code 
class Main { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
