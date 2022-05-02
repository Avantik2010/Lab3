import java.util.Stack;

public class Bracket 
{
	 public static void main (String [] args) {
		 String bracketExpression = " ([[{}]])";
		  Boolean result;
		  result= checkingBracketsBalanced(bracketExpression);
		  
		  if (result)
			  System.out.println("The entered string has Balanced Brackets");
		  else
			  System.out.println("the entered Strings do not contain Balance Brackets");
	 }
	 
	static boolean checkingBracketsBalanced(String BracketExpression) {
		Stack<Character> stack =new Stack <Character>();
		
		for (int i=0; i<BracketExpression.length(); i++ )
		{
			char character = BracketExpression.charAt(i);
			if (character =='('  || character == '[' || character =='{') {
				stack.push(character);
				continue;
			}
			
			if (stack.isEmpty())
				return false;
			char c;
			
			switch(character) {
			case '}':
			
			c= stack.pop();
			if (c=='('||c=='[')
				return false;
			break;
			
			case ')':
				c= stack.pop();
			if (c=='{'|| c=='[')
				return false ;
			break;
			
			case ']' :
				c= stack.pop();
			if (c=='{'|| c=='(')
				return false;
			break;
			
			}
		}
		return (stack.isEmpty());
	}  
	 }
	



   
  
