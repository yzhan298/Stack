
public class StackDemo {

	public static void main(String[] args) {
		Stack newStack = new Stack(5);
		System.out.print(newStack.push(1));
		System.out.print(newStack.push(2));
		System.out.print(newStack.push(3));
		System.out.print(newStack.push(4));
		System.out.print(newStack.push(5));
		System.out.println(" ");
		/*System.out.println(newStack.peek());
		System.out.println(newStack.isFull());
		System.out.println(newStack.pop());
		System.out.println(newStack.peek());
		System.out.println(newStack.pop());
		System.out.println(newStack.pop());
		System.out.println(newStack.pop());
		System.out.println(newStack.isAmpty());*/
		newStack.reverse();

	}

}
