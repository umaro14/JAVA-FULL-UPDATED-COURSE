package DSA.STACK;

import java.util.Stack;

public class Main {

    //Stack = LIFo data structer. Last-In First-Out
    //stores objects in a sort oa "vertical tower"
    //push() = add to top of stack
    //pop() = remove from top of stack
    //peek() = Looks at the object at the top of this stack without removing it
    //empty() = Tests if this stack is empty.
    //size() - Returns the number of elements in the stack.
    //contains(Object o) - Checks if the stack contains an item.
    //iterator() - Returns an iterator for the stack.
    //clear() - Removes all elements from the stack.
    //serch() =  Returns the 1-based position where an object is on this stack.
     // If the object {@code o} occurs as an item in this stack, this
     // method returns the distance from the top of the stack of the
     // occurrence nearest the top of the stack



    public static void main(String[] args) {
        
       Stack<String> siblings = new Stack<String>();


       siblings.push("Sule");  //bottm
       siblings.push("Amu");
       siblings.push("Nolly");
       siblings.push("Umaro");
       siblings.push("Sally"); //top

       siblings.pop();
       String myFavesibling = siblings.pop();

       //System.out.println(stack.empty());
       //System.out.println(myFavesibling);
       //System.out.println(siblings.peek());

       //will push sule 1 billion times
       for(int i = 0; i < 10; i++){
        siblings.push("Sule");
       }
        
       //USE OF STACK?
       //undo/redo features in text editors
       //browser history
       //backtracking algorithms(maze, file direction)
       //calling functions(call satck)
    }
}
