import java.util.LinkedList;

public class Stack {	
	private LinkedList<String> stack;
	private int size=0;
	public Stack(){
		stack = new LinkedList<String>();
	}
	
	public boolean isEmptyStack(){
		if(stack.size()==0)
			return true;
		return false;
	}
	
	public String getPeek(){
		if(!isEmptyStack())
			return stack.getLast();
		else
			return "EmptyStack";
	}
	
	public void pushStack(String stringToAdd){
		stack.addLast(stringToAdd);
		System.out.println("Element added.");
	}
	
	public String popStack(){
		if(!isEmptyStack())
			return stack.removeLast();
		else
			return "EmptyStack";
	}
	
	public void displayStack(){
		System.out.println("Elements in the Stack:");
		int size=stack.size();
		for(int i=size-1;i>=0;i--){
			System.out.println(stack.get(i));
		}
	}
}
