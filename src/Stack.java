
public class Stack {
	
	private int[] stackArray;
	private int top;
	private int maxSize;
	
	public Stack(int s) { // constructor
		maxSize = s;
		stackArray = new int[maxSize];
		top = -1;
	}
	
	public int push(int d) {
		stackArray[++top] = d;
		return d;
	}
	
	public int pop() {
		return stackArray[--top];
	}
	
	public int peek() {
		return stackArray[top];
	}
	
	public boolean isAmpty() {
		if(top == -1)
			return true;
		else 
			return false;
	}
	
	public boolean isFull() {
		if(top == (stackArray.length-1))
			return true;
		else
			return false;
	}

	public void reverse() {
		for(int i=top;i>0;i--) {
			System.out.print(peek());
			pop();
		}
		System.out.print(peek());
	}
}
