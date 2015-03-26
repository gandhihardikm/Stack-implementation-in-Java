import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StackExample {

	public static void main(String[] args) {
		int input=0;
		String choice=null;
		// TODO Auto-generated method stub
		Stack objectStack = new Stack();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do
		{
			System.out.println("CD Case \n1. Add CD\n2. Remove CD\n3. Peek CD\n4. Display CD's list");
			System.out.println("Enter your choice : ");
			try{
				input=Integer.parseInt(br.readLine());
			}catch(Exception e){
				System.out.println("Exception is : "+e);
			}
			
			switch(input){
				case 1:
					objectStack.pushStack(getName());
					break;
				case 2:
					System.out.println("Removed CD : "+ objectStack.popStack());
					break;
				case 3:
					System.out.println("Topmost CD : "+ objectStack.getPeek());
					break;
				case 4:
					objectStack.displayStack();
					break;
				default:
					System.out.println("Default choice selected");
			}
			System.out.println("Do you want to contiue? Yes OR No : ");
			try{
				choice=br.readLine();
			}catch(Exception e){
			System.out.println("Exception is : "+e);
			}	
		}while(choice.equalsIgnoreCase("Yes"));	
	}
	
	public static String getName(){
		String name=null;
		System.out.println("Enter CD's Name : ");
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			name=br.readLine();
		}catch(Exception e){
			System.out.println("Exception is : "+e);
		}
		return name;
	}	
}
